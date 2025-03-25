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
@Table(name = "INTERNATIONAL_ZONE_PROVINCE_MAPPING")
@SequenceGenerator(name = "INTERNATIONAL_ZONE_PROVINCE_MAPPING_SEQ_GENERATOR", sequenceName = "ID_SEQ_INTERNATIONAL_ZONE_PROVINCE_MAPPING", allocationSize = 1)
public class InternationalZoneCountryMapping extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INTERNATIONAL_ZONE_PROVINCE_MAPPING_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_M_INTERNATIONAL_ZONE", nullable = false)
    private InternationalZone zone;

    @ManyToOne
    @JoinColumn(name = "FK_M_COUNTRY", nullable = false)
    private Country country;
}
