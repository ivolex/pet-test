package com.hm.test.model;

import com.hm.test.model.dto.DTOEntity;

import java.util.List;

/**
 * Contract for sorted results storing. Should have ability to sync with DB.
 */
public interface DTOHolder {
    List<DTOEntity> fetchAll();
    List<DTOEntity> fetchAllSorted();
    void update();
    void addNew(DTOEntity dtoEntity);
    void gracefulCleanup();
    DTOEntity fetchLastSorted();
}
