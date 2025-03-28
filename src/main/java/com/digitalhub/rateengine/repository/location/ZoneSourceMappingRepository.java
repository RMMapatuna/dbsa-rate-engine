package com.digitalhub.rateengine.repository.location;

import com.digitalhub.rateengine.entity.location.ZoneGroup;
import com.digitalhub.rateengine.entity.location.ZoneSourceMapping;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ZoneSourceMappingRepository extends CrudRepository<ZoneSourceMapping, Long> {

    Optional<ZoneSourceMapping> findByIdSourceTableAndZone_ZoneGroup(Long idSourceTable, ZoneGroup zoneGroup);
}
