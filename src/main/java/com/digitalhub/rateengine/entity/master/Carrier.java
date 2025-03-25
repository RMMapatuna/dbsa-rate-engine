package com.digitalhub.rateengine.entity.master;

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
@Table(name = "M_CARRIER")
@SequenceGenerator(name = "M_CARRIER_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_CARRIER", allocationSize = 1)
public class Carrier extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_CARRIER_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)", unique = true)
    private String name;

    @Column(name = "CODE", columnDefinition = "nvarchar(32)")
    private String code;

    @Column(name = "CURRENCY_CODE", nullable = false, columnDefinition = "nvarchar(6)")
    private String currencyCode;
}
