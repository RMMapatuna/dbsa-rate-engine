package com.digitalhub.rateengine.service.location;

import com.digitalhub.rateengine.constant.ShippingType;
import com.digitalhub.rateengine.entity.location.CompanyZoneGroupMapping;
import com.digitalhub.rateengine.entity.location.ZoneGroup;
import com.digitalhub.rateengine.entity.master.Company;
import com.digitalhub.rateengine.repository.location.CompanyZoneGroupMappingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyZoneGroupMappingServiceImpl implements CompanyZoneGroupMappingService {

    private final CompanyZoneGroupMappingRepository companyZoneGroupMappingRepository;

    @Override
    public List<ZoneGroup> getZoneGroupsByCompanyAndShippingType(Company company, ShippingType shippingType) {
        return this.companyZoneGroupMappingRepository.findByCompany_IdAndShippingTypeAndActiveTrue(company.getId(), shippingType)
                .stream()
                .map(CompanyZoneGroupMapping::getZoneGroup)
                .distinct()
                .collect(Collectors.toList());
    }
}
