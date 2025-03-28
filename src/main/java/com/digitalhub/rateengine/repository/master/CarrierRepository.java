package com.digitalhub.rateengine.repository.master;

import com.digitalhub.rateengine.entity.master.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarrierRepository extends JpaRepository<Carrier, Integer> {

    Optional<Carrier> findByNameAndActiveTrue(String name);
}
