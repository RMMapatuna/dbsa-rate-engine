package com.digitalhub.rateengine.entity.location;

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
@Table(name = "DOMESTIC_ZONE_PROVINCE_MAPPING")
@SequenceGenerator(name = "DOMESTIC_ZONE_PROVINCE_MAPPING_SEQ_GENERATOR", sequenceName = "ID_SEQ_DOMESTIC_ZONE_PROVINCE_MAPPING", allocationSize = 1)
public class DomesticZoneProvinceMapping extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOMESTIC_ZONE_PROVINCE_MAPPING_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_M_DOMESTIC_ZONE", nullable = false)
    private DomesticZone zone;

    @ManyToOne
    @JoinColumn(name = "FK_M_PROVINCE", nullable = false)
    private Province province;
}
