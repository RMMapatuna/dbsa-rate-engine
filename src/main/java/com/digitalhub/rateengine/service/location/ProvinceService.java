package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.entity.location.Province;

import java.util.Optional;

public interface ProvinceService {

    Optional<Province> findProvinceByName(String name);
}
