package se.disabledsecurity.policealert.populator.service;

import se.disabledsecurity.policealert.populator.domain.external.Alert;
import se.disabledsecurity.policealert.populator.entity.LocationEntity;


public interface DatabaseService {
   LocationEntity save(Alert alert);

}
