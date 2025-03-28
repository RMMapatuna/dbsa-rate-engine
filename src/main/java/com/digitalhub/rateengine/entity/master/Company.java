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
@Table(name = "M_COMPANY")
@SequenceGenerator(name = "M_COMPANY_SEQ_GENERATOR", sequenceName = "ID_SEQ_M_COMPANY", allocationSize = 1)
public class Company extends MBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_COMPANY_SEQ_GENERATOR")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "nvarchar(128)", unique = true)
    private String name;

    @Column(name = "CODE", columnDefinition = "nvarchar(32)")
    private String code;
}
