package com.digitalhub.rateengine.repository.master;

import com.digitalhub.rateengine.entity.master.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    Optional<Company> findByNameAndActiveTrue(String name);
}
