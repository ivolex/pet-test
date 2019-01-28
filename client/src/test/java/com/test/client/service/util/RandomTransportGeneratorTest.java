package com.test.client.service.util;

import com.test.client.model.Transport;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RandomTransportGeneratorTest {

    @Test
    public void givenListSizeWhenGenerateThenReturnTheSameNumberOfElements() {
        int listSize = 2000;

        RandomTransportGenerator generator = new RandomTransportGenerator();
        List<Transport> list = generator.generate(listSize);

        assertEquals(listSize, list.size());
    }
}
