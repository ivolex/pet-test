package com.test.client.service.transport;

import com.test.client.model.Transport;
import org.springframework.stereotype.Service;

@Service
public interface TransportService {
    void addNew(Transport transport);

    void remove(Transport transport);
}
