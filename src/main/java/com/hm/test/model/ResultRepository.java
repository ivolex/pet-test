package com.hm.test.model;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ResultRepository extends PagingAndSortingRepository<HMEntity, Long> {
}
