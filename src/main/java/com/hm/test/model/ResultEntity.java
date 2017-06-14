package com.hm.test.model;

import javax.persistence.*;

/**
 * Created by oleksii.ivanchenko on 6/11/17.
 * Entity that represents sorted result. Creation timestamp and sorted Integer set should be as basic fields.
 */

@Entity
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String sortedArray;

    private int changeCount;

    private String timeEstimate;

    public ResultEntity() {
    }

    public ResultEntity(String sortedArray, int changeCount, String timeEstimate) {
        this.sortedArray = sortedArray;
        this.changeCount = changeCount;
        this.timeEstimate = timeEstimate;
    }

    public int getId() {
        return id;
    }

    public String getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(String sortedArray) {
        this.sortedArray = sortedArray;
    }

    public int getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(int changeCount) {
        this.changeCount = changeCount;
    }

    public String getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(String timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    @Override
    public String toString() {
        return String.format("ResultEntity{" +
                "id=%d"+
                ", sortedArray='%s'" +
                ", changeCount= %d" +
                ", timeEstimate='%s'" +
                '}', id, sortedArray, changeCount, timeEstimate);
    }
}
