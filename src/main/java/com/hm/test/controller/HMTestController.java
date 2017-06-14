package com.hm.test.controller;

import com.hm.test.model.ResultEntity;
import com.hm.test.model.dto.InputEntity;
import com.hm.test.service.SortedResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    public List<ResultEntity> fetchAll() {
        return service.getAllSorted();
    }

    @RequestMapping(value = "/addNew", method = RequestMethod.POST)
    public void addNew(@RequestBody InputEntity inputEntity){}

    @RequestMapping(value = "/cleanup", method = RequestMethod.GET)
    public void cleanup(@RequestBody InputEntity inputEntity){}
}
