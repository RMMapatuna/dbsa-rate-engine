package com.digitalhub.rateengine.entity.rate;

import com.digitalhub.rateengine.entity.MBaseEntity;
import com.digitalhub.rateengine.entity.location.Zone;
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
@Table(name = "M_ZONE_CALCULATION")
@SequenceGenerator(name = "M_ZONE_CALCULATION_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_ZONE_CALCULATION", allocationSize = 1)
public class ZoneCalculation extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_ZONE_CALCULATION_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_ZONE_ORIGIN", nullable = false)
    private Zone originZone;

    @ManyToOne
    @JoinColumn(name = "FK_ZONE_DESTINATION", nullable = false)
    private Zone destinationZone;

    @ManyToOne
    @JoinColumn(name = "FK_ZONE_CALCULATION", nullable = false)
    private Zone calculationZone;

    @ManyToOne
    @JoinColumn(name = "FK_M_ZONE_CALCULATION_GROUP", nullable = false)
    private ZoneCalculationGroup zoneCalculationGroup;
}
