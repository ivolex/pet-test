package com.hm.test.model;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ResultRepository extends PagingAndSortingRepository<ResultEntity, Long> {
//
//    List<ResultEntity> fetchAllSortEntities();
//    void clearAllSortEntities();
//    void addSortEntity(ResultEntity sortEntity);


    List<ResultEntity> findByTimeEstimate(String timeEstimate);
}
