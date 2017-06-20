package com.hm.test.model;

import com.hm.test.model.dto.DTOEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class DTOHolderImp implements DTOHolder {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");

    private List<DTOEntity> dtoEntities;
    private List<DTOEntity> sortedDtoEntities;

    @Autowired
    private ResultRepository repository;

    @Override
    public List<DTOEntity> fetchAll() {
        return dtoEntities;
    }

    @Override
    public List<DTOEntity> fetchAllSorted() {
        return sortedDtoEntities;
    }

    @Override
    public void update() {
        populateDtoLists();
    }

    @Override
    public void addNew(DTOEntity dtoEntity) {
        HMEntity newEntity = createFromDTO(dtoEntity);
        repository.save(newEntity);
        dtoEntity.setTimestamp(newEntity.getTimestamp());
        getDtoEntities().add(createFromEntity(newEntity, false));
        getSortedDtoEntities().add(createFromEntity(newEntity, true));
    }

    @Override
    public void gracefulCleanup() {
        dtoEntities = null;
        sortedDtoEntities = null;
        repository.deleteAll();
    }

    @Override
    public DTOEntity fetchLastSorted() {
        if (getSortedDtoEntities().size() >= 1) {
            return getSortedDtoEntities().get(getSortedDtoEntities().size() - 1);
        }
        return null;
    }

    private static HMEntity createFromDTO(DTOEntity dtoEntity) {
        HMEntity entity = new HMEntity();
        LocalDateTime currentTime = LocalDateTime.now();
        String timestam = currentTime.format(formatter);
        entity.setTimestamp(timestam);
        entity.setDataArray(StringUtils.collectionToCommaDelimitedString(dtoEntity.getInput()));
        return entity;
    }

    private static DTOEntity createFromEntity(HMEntity entity, boolean isSorted) {
        DTOEntity dto = new DTOEntity();
        dto.setTimestamp(entity.getTimestamp());

        List<String> dataValues = Arrays.asList(entity.getDataArray().split(","));
        if (isSorted) {
            Collections.sort(dataValues, new Comparator<String>() {
                public int compare(String value1, String value2) {
                    return extractInt(value1) - extractInt(value2);
                }

                int extractInt(String s) {
                    String num = s.replaceAll("\\D", "");
                    // return 0 if no digits found
                    return num.isEmpty() ? 0 : Integer.parseInt(num);
                }
            });
        }
        List<Integer> dataArray = dataValues.stream().map(Integer::parseInt).collect(Collectors.toList());
        dto.setInput(dataArray);
        return dto;
    }

    private List<DTOEntity> getDtoEntities() {
        if (dtoEntities == null) {
            dtoEntities = new ArrayList<>();
        }
        return dtoEntities;
    }

    private List<DTOEntity> getSortedDtoEntities() {
        if (sortedDtoEntities == null) {
            sortedDtoEntities = new ArrayList<>();
        }
        return sortedDtoEntities;
    }

    private void populateDtoLists() {
        List<HMEntity> entities = (List<HMEntity>) repository.findAll();
        this.sortedDtoEntities = null;
        this.dtoEntities = null;
        for (HMEntity entity : entities) {
            getDtoEntities().add(createFromEntity(entity, false));
            getSortedDtoEntities().add(createFromEntity(entity, true));
        }
    }

}
