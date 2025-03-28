package com.digitalhub.rateengine.repository.location;

import com.digitalhub.rateengine.entity.location.Province;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProvinceRepository extends CrudRepository<Province, Long> {

    Optional<Province> findByNameAndActiveTrue(String name);
}
