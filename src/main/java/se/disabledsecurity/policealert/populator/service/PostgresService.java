package se.disabledsecurity.policealert.populator.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se.disabledsecurity.policealert.populator.domain.external.Alert;
import se.disabledsecurity.policealert.populator.entity.AlertEntity;
import se.disabledsecurity.policealert.populator.entity.LocationEntity;
import se.disabledsecurity.policealert.populator.mapper.AlertMapper;
import se.disabledsecurity.policealert.populator.mapper.LocationMapper;
import se.disabledsecurity.policealert.populator.repository.LocationRepository;


@Service
public class PostgresService implements DatabaseService {
    private LocationRepository locationRepository;


    public PostgresService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Transactional
    @Override
    public LocationEntity save(Alert alert) {
        return updateOrCreateEntity(alert);
    }

    private LocationEntity updateOrCreateEntity(Alert alert) {
        LocationEntity location = LocationMapper.map(alert);
        AlertEntity alertEntity = AlertMapper.map(alert);
        location.addAlert(alertEntity);
        alertEntity.setLocation(location);

        return locationRepository.save(location);
    }
}
