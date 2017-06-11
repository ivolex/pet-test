package com.hm.test.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hm.test.model.SortedResultEntity;

import java.util.List;

/**
 * Created by oleksii.ivanchenko on 6/11/17.
 * Contract for Results service.
 */
public interface SortedResultService {
    List<SortedResultEntity> getAllRaw();

    List<SortedResultEntity> getAllSorted();

    void addNew(JSONPObject entityJSONObject);

    void cleanup();
}
