package se.disabledsecurity.policealert.populator.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import se.disabledsecurity.policealert.populator.domain.external.Alert;

import java.util.Arrays;
import java.util.Objects;

@Service
public class ExternalAlertService implements AlertService {

    private final RestTemplate client;
    private final DatabaseService databaseService;
    private final String url;


    public ExternalAlertService(RestTemplate client, DatabaseService databaseService, @Value("${url}") String url){
        this.client = client;
        this.databaseService = databaseService;
        this.url = url;
    }

    @Override
    public void getAlerts() {
         Arrays.stream(Objects.requireNonNull(client.
                 getForEntity(url, Alert[].class)
                 .getBody()))
                 .forEach(databaseService::save);
    }


    @Scheduled(cron = "0 */10 * * * *", zone = "Europe/Stockholm")
    public void getAlertsScheduled () {
        getAlerts();
    }
}