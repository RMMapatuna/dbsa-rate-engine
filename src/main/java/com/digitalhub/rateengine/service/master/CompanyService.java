package com.digitalhub.rateengine.service.master;

import com.digitalhub.rateengine.entity.master.Company;

import java.util.Optional;

public interface CompanyService {

    Optional<Company> getCompany(String name);
}
