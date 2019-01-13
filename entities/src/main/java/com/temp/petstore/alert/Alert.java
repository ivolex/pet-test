package com.temp.petstore.alert;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.temp.petstore.transport.TransportType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
public class Alert {

    public static final int STEP_DOWN_PERCENT = 3;

    private Long Id;
    private TransportType transportType;
}
