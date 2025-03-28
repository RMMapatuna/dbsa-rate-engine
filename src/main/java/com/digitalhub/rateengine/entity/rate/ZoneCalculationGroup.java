package com.digitalhub.rateengine.entity.rate;

import com.digitalhub.rateengine.entity.MBaseEntity;
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
@Table(name = "M_ZONE_CALCULATION_GROUP")
@SequenceGenerator(name = "M_ZONE_CALCULATION_GROUP_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_ZONE_CALCULATION_GROUP", allocationSize = 1)
public class ZoneCalculationGroup extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_ZONE_CALCULATION_GROUP_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)", unique = true)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;
}
