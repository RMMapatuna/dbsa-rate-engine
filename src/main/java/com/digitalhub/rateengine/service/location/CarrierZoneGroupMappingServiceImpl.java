package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.constant.ShippingType;
import com.digitalhub.rateengine.entity.location.CarrierZoneGroupMapping;
import com.digitalhub.rateengine.entity.location.ZoneGroup;
import com.digitalhub.rateengine.entity.master.Carrier;
import com.digitalhub.rateengine.repository.location.CarrierZoneGroupMappingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarrierZoneGroupMappingServiceImpl implements CarrierZoneGroupMappingService {

    private final CarrierZoneGroupMappingRepository carrierZoneGroupMappingRepository;

    @Override
    public List<ZoneGroup> getZoneGroupsByCarrierAndShippingType(Carrier carrier, ShippingType shippingType) {
        return this.carrierZoneGroupMappingRepository.findByCarrier_IdAndShippingTypeAndActiveTrue(carrier.getId(), shippingType)
                .stream()
                .map(CarrierZoneGroupMapping::getZoneGroup)
                .distinct()
                .collect(Collectors.toList());
    }
}
