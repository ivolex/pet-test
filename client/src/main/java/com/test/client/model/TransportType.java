package com.test.client.model;

public enum TransportType {
    CAR(40f),
    BUS(100f),
    TRUCK(130f);

    private Float capacity;

    TransportType(Float capacity) {
        this.capacity = capacity;
    }

    public Float getCapacity() {
        return this.capacity;
    }
}
