package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.entity.location.Country;
import com.digitalhub.rateengine.repository.location.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public Optional<Country> getCountryByName(String name) {
        return this.countryRepository.findByNameAndActiveTrue(name);
    }
}
