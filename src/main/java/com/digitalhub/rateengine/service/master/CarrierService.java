package com.digitalhub.rateengine.service.master;

import com.digitalhub.rateengine.entity.master.Carrier;

import java.util.Optional;

public interface CarrierService {

    Optional<Carrier> getCarrier(String name);
}
