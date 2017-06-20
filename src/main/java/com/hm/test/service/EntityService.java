package com.hm.test.service;

import com.hm.test.model.dto.DTOEntity;

import java.util.List;

/**
 * Created by oleksii.ivanchenko on 6/11/17.
 * Contract for Results service.
 */
public interface EntityService {
    List<DTOEntity> getAll();

    List<DTOEntity> getAllSorted();

    void addNew(DTOEntity dtoEntity);
    DTOEntity getLastSorted();

    void cleanup();
}
