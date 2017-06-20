package com.hm.test;

import com.hm.test.model.HMEntity;
import com.hm.test.model.ResultRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HMTestApplication {
    
    private static final Logger log = LoggerFactory.getLogger(HMTestApplication.class);

    public static void main(String... args) {
        SpringApplication.run(HMTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ResultRepository repository) {
        return (args) -> {
            // save a couple of SortedResultEntitys
            repository.save(new HMEntity("32,54,23,234,23", "3432423"));
            repository.save(new HMEntity("32,54,243,234,27", "13414"));
            repository.save(new HMEntity("32,5,23,234,23", "3636536"));
            repository.save(new HMEntity("32,54,23,234,13", "4363463"));
            repository.save(new HMEntity("82,54,23,24,23", "32423536"));

            // fetch all SortedResultEntitys
            log.info("SortedResultEntitys found with findAll():");
            log.info("-------------------------------");
            for (HMEntity HMEntity : repository.findAll()) {
                log.info(HMEntity.toString());
            }
            log.info("");

            // fetch an individual HMEntity by ID
            HMEntity HMEntity = repository.findOne(1L);
            log.info("HMEntity found with findOne(1L):");
            log.info("--------------------------------");
            log.info(HMEntity.toString());
            log.info("");


        };
    }
}
