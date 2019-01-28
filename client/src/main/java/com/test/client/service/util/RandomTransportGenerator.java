package com.test.client.service.util;

import com.test.client.model.Transport;
import com.test.client.model.TransportState;
import com.test.client.model.TransportType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTransportGenerator implements TransportGenerator {
    @Override
    public List<Transport> generate(int size) {
        return generateRandomList(size);
    }

    private List<Transport> generateRandomList(int size) {
        List<Transport> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Transport transport = new Transport();
            TransportType type = getRandom();
            transport.Id(i);
            transport.type(type);
            transport.currentGasValue(type.getCapacity());
            transport.state(TransportState.DEFAULT);
            list.add(transport);
        }
        return list;
    }

    private TransportType getRandom() {
        TransportType[] values = TransportType.values();
        return values[new Random().nextInt(values.length)];
    }
}
