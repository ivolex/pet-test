package com.hm.test.model;

import javax.persistence.*;

/**
 * Created by oleksii.ivanchenko on 6/11/17.
 * Entity that represents sorted result. Creation timestamp and Integer set should be as basic fields.
 */

@Entity
public class HMEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String dataArray;

    private String timestamp;

    public HMEntity() {
    }

    public HMEntity(String dataArray, String timestamp) {
        this.dataArray = dataArray;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public String getDataArray() {
        return dataArray;
    }

    public void setDataArray(String dataArray) {
        this.dataArray = dataArray;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return String.format("HMEntity{" +
                "id=%d"+
                ", dataArray='%s'" +
                ", timestamp='%s'" +
                '}', id, dataArray, timestamp);
    }
}
