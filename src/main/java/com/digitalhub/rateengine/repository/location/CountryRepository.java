package com.digitalhub.rateengine.repository.location;

import com.digitalhub.rateengine.entity.location.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {

    Optional<Country> findByNameAndActiveTrue(String name);
}
