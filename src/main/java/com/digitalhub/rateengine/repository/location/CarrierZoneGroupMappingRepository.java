package com.digitalhub.rateengine.repository.location;

import com.digitalhub.rateengine.constant.ShippingType;
import com.digitalhub.rateengine.entity.location.CarrierZoneGroupMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarrierZoneGroupMappingRepository extends JpaRepository<CarrierZoneGroupMapping, Long> {

    List<CarrierZoneGroupMapping> findByCarrier_IdAndShippingTypeAndActiveTrue(Long idCarrier, ShippingType shippingType);
}
