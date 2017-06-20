package com.hm.test.service;

import com.hm.test.model.DTOHolder;
import com.hm.test.model.dto.DTOEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityServiceImpl implements EntityService {
    private static Logger logger = LoggerFactory.getLogger(EntityServiceImpl.class);


    @Autowired
    private DTOHolder dtoHolder;


    @Override
    public List<DTOEntity> getAll() {
        return dtoHolder.fetchAll();
    }

    @Override
    public List<DTOEntity> getAllSorted() {
        return dtoHolder.fetchAllSorted();
    }

    @Override
    public void addNew(DTOEntity dtoEntity) {

    }

    @Override
    public DTOEntity getLastSorted() {
        return dtoHolder.fetchLastSorted();
    }

    @Override
    public void cleanup() {
        dtoHolder.gracefulCleanup();
    }


}
