package com.hm.test.model.dto;

import java.util.List;

public class DTOEntity {
    List<Integer> input;
    String timestamp;

    public DTOEntity() {
    }

    public DTOEntity(List<Integer> input, String timestamp) {
        this.input = input;
        this.timestamp = timestamp;
    }

    public List<Integer> getInput() {
        return input;
    }

    public void setInput(List<Integer> input) {
        this.input = input;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
