package com.hm.test.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hm.test.model.ResultEntity;
import com.hm.test.model.ResultRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortedResultServiceImpl implements SortedResultService {
    private static Logger logger = LoggerFactory.getLogger(SortedResultServiceImpl.class);

    @Autowired
    private ResultRepository repository;

    @Override
    public List<ResultEntity> getAllRaw() {
        logger.debug("-------- getAllRaw() has been called ---------");
        return null;
    }

    @Override
    public List<ResultEntity> getAllSorted() {
        logger.debug("-------- getAllRaw() has been called ---------");
        return null;
    }

    @Override
    public void addNew(JSONPObject entityJSONObject) {
        logger.debug("-------- addNew() has been called ---------");
        logger.debug("-------- received object:\n " + entityJSONObject.toString());
    }

    @Override
    public void cleanup() {
        logger.debug("-------- cleanup() has been called ---------");
    }
}
