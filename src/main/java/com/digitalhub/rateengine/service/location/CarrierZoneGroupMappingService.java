package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.constant.ShippingType;
import com.digitalhub.rateengine.entity.location.ZoneGroup;
import com.digitalhub.rateengine.entity.master.Carrier;

import java.util.List;

public interface CarrierZoneGroupMappingService {

    List<ZoneGroup> getZoneGroupsByCarrierAndShippingType(Carrier carrier, ShippingType shippingType);
}
