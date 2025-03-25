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
@Table(name = "M_ZONE")
@SequenceGenerator(name = "M_ZONE_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_ZONE", allocationSize = 1)
public class Zone extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_ZONE_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne
    @JoinColumn(name = "FK_M_ZONE_GROUP", nullable = false)
    private ZoneGroup zoneGroup;
}
