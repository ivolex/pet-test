package com.hm.test.controller;

import com.hm.test.model.SortedResultEntity;
import com.hm.test.service.SortedResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by oleksii.ivanchenko on 6/11/17.
 * REST controller for HM test
 */
@RestController
@RequestMapping("/hm")
public class HMTestController {

    @Autowired
    private SortedResultService service;

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public List<SortedResultEntity> fetchAll() {
        return service.getAllSorted();
    }
}
