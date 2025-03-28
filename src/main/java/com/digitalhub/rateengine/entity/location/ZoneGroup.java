package com.digitalhub.rateengine.entity.location;

import com.digitalhub.rateengine.constant.ZoneSourceTable;
import com.digitalhub.rateengine.entity.MBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "M_ZONE_GROUP")
@SequenceGenerator(name = "M_ZONE_GROUP_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_ZONE_GROUP", allocationSize = 1)
public class ZoneGroup extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_ZONE_GROUP_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "SOURCE_TABLE")
    private ZoneSourceTable sourceTable;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        ZoneGroup zoneGroup = (ZoneGroup) object;
        return Objects.equals(id, zoneGroup.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
