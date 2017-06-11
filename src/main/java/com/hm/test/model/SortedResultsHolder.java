package com.hm.test.model;

/**
 * Created by oleksii.ivanchenko on 6/11/17.
 * Contract for sorted results storing. Should have ability to sync with DB.
 */
public interface SortedResultsHolder {
    void putNewSortedResult();
}
