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
@Table(name = "ZONE_SOURCE_MAPPING")
@SequenceGenerator(name = "ZONE_SOURCE_MAPPING_SEQ_GENERATOR", sequenceName = "ID_SEQ_ZONE_SOURCE_MAPPING", allocationSize = 1)
public class ZoneSourceMapping extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ZONE_SOURCE_MAPPING_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FK_M_ZONE", nullable = false)
    private Zone zone;

    @Column(name = "FK_SOURCE_TABLE_ID", nullable = false)
    private Long idSourceTable;
}
