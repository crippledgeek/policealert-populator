package se.disabledsecurity.policealert.populator.mapper;

import se.disabledsecurity.policealert.populator.domain.external.Alert;
import se.disabledsecurity.policealert.populator.entity.AlertEntity;
import se.disabledsecurity.policealert.populator.entity.EventType;

public class AlertMapper {
    public static AlertEntity map(Alert alert) {
        AlertEntity alertEntity = new AlertEntity();
        alertEntity.setName(alert.getName());
        alertEntity.setType(EventType.valueOf(alert.getType().name()));
        alertEntity.setUrl(alert.getUrl());
        alertEntity.setDatetime(alert.getDatetime());
        alertEntity.setSummary(alert.getSummary());
        alertEntity.setExternalId(alert.getId());

        return alertEntity;
    }
}
