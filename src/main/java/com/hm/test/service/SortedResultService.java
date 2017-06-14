package com.hm.test.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hm.test.model.ResultEntity;

import java.util.List;

/**
 * Created by oleksii.ivanchenko on 6/11/17.
 * Contract for Results service.
 */
public interface SortedResultService {
    List<ResultEntity> getAllRaw();

    List<ResultEntity> getAllSorted();

    void addNew(JSONPObject entityJSONObject);

    void cleanup();
}
