package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.entity.location.Zone;
import com.digitalhub.rateengine.entity.location.ZoneGroup;
import com.digitalhub.rateengine.entity.location.ZoneSourceMapping;
import com.digitalhub.rateengine.repository.location.ZoneSourceMappingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ZoneSourceMappingServiceImpl implements ZoneSourceMappingService {

    private final ZoneSourceMappingRepository zoneSourceMappingRepository;

    @Override
    public Optional<Zone> findZoneBySourceTableIdAndZoneGroup(Long idSourceTable, ZoneGroup zoneGroup) {
        return this.zoneSourceMappingRepository.findByIdSourceTableAndZone_ZoneGroup(idSourceTable, zoneGroup)
                .map(ZoneSourceMapping::getZone);
    }
}
