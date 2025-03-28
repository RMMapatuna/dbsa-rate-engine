package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.entity.location.Country;

import java.util.Optional;

public interface CountryService {

    Optional<Country> getCountryByName(String name);
}
