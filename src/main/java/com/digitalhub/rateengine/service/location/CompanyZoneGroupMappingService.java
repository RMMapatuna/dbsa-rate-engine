package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.constant.ShippingType;
import com.digitalhub.rateengine.entity.location.ZoneGroup;
import com.digitalhub.rateengine.entity.master.Company;

import java.util.List;

public interface CompanyZoneGroupMappingService {

    List<ZoneGroup> getZoneGroupsByCompanyAndShippingType(Company company, ShippingType shippingType);
}
