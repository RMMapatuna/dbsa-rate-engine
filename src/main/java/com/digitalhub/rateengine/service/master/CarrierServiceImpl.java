package com.digitalhub.rateengine.service.master;

import com.digitalhub.rateengine.entity.master.Carrier;
import com.digitalhub.rateengine.repository.master.CarrierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarrierServiceImpl implements CarrierService {

    private final CarrierRepository carrierRepository;

    @Override
    public Optional<Carrier> getCarrier(String name) {
        return this.carrierRepository.findByNameAndActiveTrue(name);
    }
}
