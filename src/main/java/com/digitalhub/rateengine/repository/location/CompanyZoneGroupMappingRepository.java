package com.digitalhub.rateengine.repository.location;

import com.digitalhub.rateengine.constant.ShippingType;
import com.digitalhub.rateengine.entity.location.CompanyZoneGroupMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyZoneGroupMappingRepository extends JpaRepository<CompanyZoneGroupMapping, Long> {

    List<CompanyZoneGroupMapping> findByCompany_IdAndShippingTypeAndActiveTrue(Long idCarrier, ShippingType shippingType);
}
