package com.digitalhub.rateengine.entity.rate;

import com.digitalhub.rateengine.constant.ShippingType;
import com.digitalhub.rateengine.constant.ZoneSourceTable;
import com.digitalhub.rateengine.entity.MBaseEntity;
import com.digitalhub.rateengine.entity.master.Company;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RATE_CARD_COMPANY_MAPPING")
@SequenceGenerator(name = "M_RATE_CARD_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_RATE_CARD", allocationSize = 1)
public class RateCard extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_RATE_CARD_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)", unique = true)
    private String name;

    @Column(name = "FROM_DATE", nullable = false)
    protected LocalDateTime fromDate;

    @Column(name = "TO_DATE", nullable = false)
    protected LocalDateTime toDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "SHIPPING_TYPE")
    private ShippingType shippingType;

    @Column(name = "IS_ORIGIN_CONSIDERED", nullable = false)
    private Boolean active = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "ORIGIN_SOURCE_TABLE")
    private ZoneSourceTable sourceTable;

    @Column(name = "FK_ORIGIN_SOURCE_TABLE_ID")
    private Long idSourceTable;

    @ManyToOne
    @JoinColumn(name = "FK_M_COMPANY", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "FK_M_ZONE_CALCULATION_GROUP", nullable = false)
    private ZoneCalculationGroup zoneCalculationGroup;

}
