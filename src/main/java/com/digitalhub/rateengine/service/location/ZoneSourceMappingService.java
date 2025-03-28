package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.entity.location.Zone;
import com.digitalhub.rateengine.entity.location.ZoneGroup;

import java.util.Optional;

public interface ZoneSourceMappingService {

    Optional<Zone> findZoneBySourceTableIdAndZoneGroup(Long idSourceTable, ZoneGroup zoneGroup);
}
