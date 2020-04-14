package se.disabledsecurity.policealert.populator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.disabledsecurity.policealert.populator.entity.LocationEntity;
import se.disabledsecurity.policealert.populator.entity.LocationPK;

@Repository
public interface LocationRepository extends CrudRepository<LocationEntity, LocationPK> {
}
