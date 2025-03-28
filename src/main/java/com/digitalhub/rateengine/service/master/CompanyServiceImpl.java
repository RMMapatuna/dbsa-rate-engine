package com.digitalhub.rateengine.service.master;

import com.digitalhub.rateengine.entity.master.Company;
import com.digitalhub.rateengine.repository.master.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Override
    public Optional<Company> getCompany(String name) {
        return this.companyRepository.findByNameAndActiveTrue(name);
    }
}
