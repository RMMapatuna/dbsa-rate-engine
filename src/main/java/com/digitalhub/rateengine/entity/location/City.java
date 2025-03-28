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
@Table(name = "M_CITY")
@SequenceGenerator(name = "M_CITY_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_CITY", allocationSize = 1)
public class City extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_CITY_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)")
    private String name;

    @Column(name = "CODE", columnDefinition = "nvarchar(32)")
    private String code;

    @Column(name = "POSTAL_CODE", columnDefinition = "nvarchar(32)")
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "FK_M_PROVINCE", nullable = false)
    private Province province;
}
