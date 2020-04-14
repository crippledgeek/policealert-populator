package se.disabledsecurity.policealert.populator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PolicealertPopulatorApplication {


    public static void main(String[] args) {
        SpringApplication.run(PolicealertPopulatorApplication.class, args);
    }



}
