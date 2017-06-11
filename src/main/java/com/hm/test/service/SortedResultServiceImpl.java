package com.hm.test.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hm.test.model.SortedResultEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortedResultServiceImpl implements SortedResultService {
    @Override
    public List<SortedResultEntity> getAllRaw() {
        return null;
    }

    @Override
    public List<SortedResultEntity> getAllSorted() {
        return null;
    }

    @Override
    public void addNew(JSONPObject entityJSONObject) {

    }

    @Override
    public void cleanup() {

    }
}
