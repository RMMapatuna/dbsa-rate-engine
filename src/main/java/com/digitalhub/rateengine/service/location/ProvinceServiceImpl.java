package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.entity.location.Province;
import com.digitalhub.rateengine.repository.location.ProvinceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProvinceServiceImpl implements ProvinceService {

    private final ProvinceRepository provinceRepository;


    @Override
    public Optional<Province> findProvinceByName(String name) {
        return this.provinceRepository.findByNameAndActiveTrue(name);
    }
}
