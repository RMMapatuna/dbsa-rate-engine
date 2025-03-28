package com.digitalhub.rateengine.service;

import com.digitalhub.rateengine.entity.location.Country;
import com.digitalhub.rateengine.entity.location.Province;
import com.digitalhub.rateengine.entity.location.Zone;
import com.digitalhub.rateengine.entity.location.ZoneGroup;
import com.digitalhub.rateengine.entity.master.Carrier;
import com.digitalhub.rateengine.model.RateRequest;
import com.digitalhub.rateengine.model.RateResponse;
import com.digitalhub.rateengine.service.location.CarrierZoneGroupMappingService;
import com.digitalhub.rateengine.service.location.CountryService;
import com.digitalhub.rateengine.service.location.ProvinceService;
import com.digitalhub.rateengine.service.location.ZoneSourceMappingService;
import com.digitalhub.rateengine.service.master.CarrierService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RateServiceImpl implements RateService {

    private final CarrierService carrierService;
    private final CarrierZoneGroupMappingService carrierZoneGroupMappingService;
    private final ProvinceService provinceService;
    private final ZoneSourceMappingService zoneSourceMappingService;
    private final CountryService countryService;

    @Override
    public RateResponse getRate(RateRequest rateRequest) {

        // get carrier
        Carrier carrier = this.carrierService.getCarrier(rateRequest.getCarrier())
                .orElseThrow(() -> new RuntimeException("Carrier not found"));

        // get zone groups for carrier
        List<ZoneGroup> zoneGroups = this.carrierZoneGroupMappingService.getZoneGroupsByCarrierAndShippingType(carrier, rateRequest.getShippingType());

        if (zoneGroups.isEmpty()) {
            throw new RuntimeException("Zones not found");
        }

        for (ZoneGroup zoneGroup : zoneGroups) {

            // get pickup and delivery zones
            Zone pickupZone;
            Zone deliveryZone;

            switch (zoneGroup.getSourceTable()) {
                case COUNTRY:

                    Country pickupCountry = this.countryService.getCountryByName(rateRequest.getPickupAddress().getCountry())
                            .orElseThrow(() -> new RuntimeException("Pickup Country not found"));

                    pickupZone = this.zoneSourceMappingService.findZoneBySourceTableIdAndZoneGroup(pickupCountry.getId(), zoneGroup)
                            .orElseThrow(() -> new RuntimeException("Pickup Zone not found"));

                    Country deliveryCountry = this.countryService.getCountryByName(rateRequest.getDeliveryAddress().getCountry())
                            .orElseThrow(() -> new RuntimeException("Delivery Country not found"));

                    deliveryZone = this.zoneSourceMappingService.findZoneBySourceTableIdAndZoneGroup(deliveryCountry.getId(), zoneGroup)
                            .orElseThrow(() -> new RuntimeException("Delivery Zone not found"));

                    break;
                case PROVINCE:

                    Province pickupProvince = this.provinceService.findProvinceByName(rateRequest.getPickupAddress().getProvince())
                            .orElseThrow(() -> new RuntimeException("Pickup Province not found"));

                    pickupZone = this.zoneSourceMappingService.findZoneBySourceTableIdAndZoneGroup(pickupProvince.getId(), zoneGroup)
                            .orElseThrow(() -> new RuntimeException("Pickup Zone not found"));

                    Province deliveryProvince = this.provinceService.findProvinceByName(rateRequest.getDeliveryAddress().getProvince())
                            .orElseThrow(() -> new RuntimeException("Delivery Province not found"));

                    deliveryZone = this.zoneSourceMappingService.findZoneBySourceTableIdAndZoneGroup(deliveryProvince.getId(), zoneGroup)
                            .orElseThrow(() -> new RuntimeException("Delivery Zone not found"));

                    break;
                default:
                    throw new IllegalArgumentException("Unknown Shipping Type: " + zoneGroup.getSourceTable());
            }


        }


        return null;
    }
}
