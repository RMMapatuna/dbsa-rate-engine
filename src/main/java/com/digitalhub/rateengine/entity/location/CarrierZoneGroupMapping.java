package com.digitalhub.rateengine.entity.location;

import com.digitalhub.rateengine.constant.ZoneType;
import com.digitalhub.rateengine.entity.MBaseEntity;
import com.digitalhub.rateengine.entity.master.Carrier;
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
@Table(name = "CARRIER_ZONE_GROUP_MAPPING")
@SequenceGenerator(name = "CARRIER_ZONE_GROUP_MAPPING_SEQ_GENERATOR", sequenceName = "ID_SEQ_CARRIER_ZONE_GROUP_MAPPING", allocationSize = 1)
public class CarrierZoneGroupMapping extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CARRIER_ZONE_GROUP_MAPPING_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_M_CARRIER", nullable = false)
    private Carrier carrier;

    @ManyToOne
    @JoinColumn(name = "FK_M_ZONE_GROUP", nullable = false)
    private ZoneGroup zoneGroup;

    @Enumerated(EnumType.STRING)
    @Column(name = "ZONE_TYPE")
    private ZoneType zoneType;
}
