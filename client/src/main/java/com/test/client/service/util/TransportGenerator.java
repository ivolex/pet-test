package com.test.client.service.util;

import com.test.client.model.Transport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransportGenerator {
    List<Transport> generate(int size);
}
