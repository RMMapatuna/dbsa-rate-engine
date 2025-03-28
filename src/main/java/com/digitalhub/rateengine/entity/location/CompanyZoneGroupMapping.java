package com.digitalhub.rateengine.entity.location;

import com.digitalhub.rateengine.constant.ShippingType;
import com.digitalhub.rateengine.entity.MBaseEntity;
import com.digitalhub.rateengine.entity.master.Company;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COMPANY_ZONE_GROUP_MAPPING")
@SequenceGenerator(name = "COMPANY_ZONE_GROUP_MAPPING_SEQ_GENERATOR", sequenceName = "ID_SEQ_COMPANY_ZONE_GROUP_MAPPING", allocationSize = 1)
public class CompanyZoneGroupMapping extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMPANY_ZONE_GROUP_MAPPING_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_M_COMPANY", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "FK_M_ZONE_GROUP", nullable = false)
    private ZoneGroup zoneGroup;

    @Enumerated(EnumType.STRING)
    @Column(name = "SHIPPING_TYPE")
    private ShippingType shippingType;
}
