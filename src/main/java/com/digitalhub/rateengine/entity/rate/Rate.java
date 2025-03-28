package com.digitalhub.rateengine.entity.rate;

import com.digitalhub.rateengine.entity.MBaseEntity;
import com.digitalhub.rateengine.entity.location.Zone;
import com.digitalhub.rateengine.entity.master.GoodsType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "M_RATE")
@SequenceGenerator(name = "M_RATE_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_RATE", allocationSize = 1)
public class Rate extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_RATE_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_M_GOODS_TYPE", nullable = false)
    private GoodsType goodsType;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)", unique = true)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "FROM_WEIGHT")
    private BigDecimal fromWeight = BigDecimal.ZERO;

    @Column(name = "TO_WEIGHT")
    private BigDecimal toWeight = BigDecimal.ZERO;

    @Column(name = "BASE_CHARGE")
    private BigDecimal baseCharge = BigDecimal.ZERO;

    @Column(name = "CAN_ADDITIONAL_WEIGHT_ADDED", nullable = false)
    private Boolean active = false;

    @Column(name = "ADDITIONAL_CHARGE_PER_KG")
    private BigDecimal additionalChargePerKg = BigDecimal.ZERO;

    @ManyToOne
    @JoinColumn(name = "FK_M_ZONE", nullable = false)
    private Zone zone;
}
