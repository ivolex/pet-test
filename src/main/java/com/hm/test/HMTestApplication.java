package com.hm.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HMTestApplication {
    
    private static final Logger log = LoggerFactory.getLogger(HMTestApplication.class);

    public static void main(String... args) {
        SpringApplication.run(HMTestApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(ResultRepository repository) {
//        return (args) -> {
//            // save a couple of SortedResultEntitys
//            repository.save(new ResultEntity("32,54,23,234,23", 1, "3432423"));
//            repository.save(new ResultEntity("32,54,243,234,27", 1, "13414"));
//            repository.save(new ResultEntity("32,5,23,234,23", 1, "3636536"));
//            repository.save(new ResultEntity("32,54,23,234,13", 1, "4363463"));
//            repository.save(new ResultEntity("82,54,23,24,23", 1, "32423536"));
//
//            // fetch all SortedResultEntitys
//            log.info("SortedResultEntitys found with findAll():");
//            log.info("-------------------------------");
//            for (ResultEntity ResultEntity : repository.findAll()) {
//                log.info(ResultEntity.toString());
//            }
//            log.info("");
//
//            // fetch an individual ResultEntity by ID
//            ResultEntity ResultEntity = repository.findOne(1L);
//            log.info("ResultEntity found with findOne(1L):");
//            log.info("--------------------------------");
//            log.info(ResultEntity.toString());
//            log.info("");
//
//            // fetch SortedResultEntitys by last name
//            log.info("ResultEntity found with findByLastName('4363463'):");
//            log.info("--------------------------------------------");
//            for (ResultEntity bauer : repository.findByTimeEstimate("4363463")) {
//                log.info(bauer.toString());
//            }
//            log.info("");
//        };
//    }
}
