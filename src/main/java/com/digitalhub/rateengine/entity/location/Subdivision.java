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
@Table(name = "M_SUBDIVISION")
@SequenceGenerator(name = "M_SUBDIVISION_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_SUBDIVISION", allocationSize = 1)
public class Subdivision extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_SUBDIVISION_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)")
    private String name;

    @Column(name = "POSTAL_CODE", columnDefinition = "nvarchar(32)")
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "FK_M_CITY", nullable = false)
    private City city;
}
