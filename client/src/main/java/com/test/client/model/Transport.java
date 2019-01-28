package com.test.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
public class Transport {
    private Integer Id;
    private float currentGasValue;
    private TransportType type;
    private TransportState state;
}
