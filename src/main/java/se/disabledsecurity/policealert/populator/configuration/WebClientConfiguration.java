package se.disabledsecurity.policealert.populator.configuration;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class WebClientConfiguration {

    @Bean
    public RestTemplate client(RestTemplateBuilder builder) {
        return builder
                .build();
    }
}

