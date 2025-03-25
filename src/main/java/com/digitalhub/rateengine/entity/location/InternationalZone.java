package com.digitalhub.rateengine.entity.location;

import com.digitalhub.rateengine.constant.InternationalZoneType;
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
@Table(name = "M_INTERNATIONAL_ZONE")
@SequenceGenerator(name = "M_INTERNATIONAL_ZONE_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_INTERNATIONAL_ZONE", allocationSize = 1)
public class InternationalZone extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_INTERNATIONAL_ZONE_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "ZONE_TYPE", columnDefinition = "nvarchar(64)")
    private InternationalZoneType zoneType;
}
