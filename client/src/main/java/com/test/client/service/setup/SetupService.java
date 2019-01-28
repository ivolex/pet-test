package com.test.client.service.setup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class SetupService {
    private static final String PROTOCOL = "http://";
    private static final String PORT = ":5555/";
    private static final String HEALTH_CHECK = "actuator/health";
    private static final String HEALTH_CHECK_SUCCESS = "{\"status\":\"UP\"}";
    private Logger logger = LoggerFactory.getLogger(SetupService.class);
    private String host;
    private String url;

    public void setHost(String host) {
        this.host = host;
        logger.info("Server host has been setup to '" + this.host + "'.");
    }

    public void setupConnection() {
        this.url = PROTOCOL + host + PORT;
        System.out.println("Connection established - " + healthCheck());
    }

    private boolean healthCheck() {
        try {
            URI healthCheckURI = new URI(this.url + HEALTH_CHECK);
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(healthCheckURI, String.class);

            assert result != null;
            return result.contains(HEALTH_CHECK_SUCCESS);
        } catch (Exception e) {
            String errorMessage = "Connection problem:\n" + e.getMessage();
            logger.error(errorMessage);
            throw new SetupServiceException(errorMessage);
        }
    }
}
