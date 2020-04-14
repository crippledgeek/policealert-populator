package se.disabledsecurity.policealert.populator.mapper;

import se.disabledsecurity.policealert.populator.domain.external.Alert;
import se.disabledsecurity.policealert.populator.entity.LocationEntity;
import se.disabledsecurity.policealert.populator.entity.LocationPK;

public class LocationMapper {
    public static LocationEntity map (Alert alert) {
        LocationEntity locationEntity = new LocationEntity();
        LocationPK locationPK = new LocationPK();
        locationPK.setName(alert.getLocation().getLocationName());
        locationPK.setGps(alert.getLocation().getGps());
        locationEntity.setLocationPK(locationPK);
        return  locationEntity;
    }
}
