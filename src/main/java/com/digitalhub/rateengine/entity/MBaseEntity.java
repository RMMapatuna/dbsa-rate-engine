package com.digitalhub.rateengine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class MBaseEntity implements Serializable {

    @Column(name = "IS_ACTIVE", nullable = false)
    protected Boolean active = true;

    @Column(name = "CREATED_BY", updatable = false, columnDefinition = "nvarchar(64)")
    protected String createdBy;

    @CreationTimestamp
    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    protected LocalDateTime createdDate;

    @Column(name = "UPDATED_BY", columnDefinition = "nvarchar(64)")
    protected String updatedBy;

    @UpdateTimestamp
    @Column(name = "UPDATED_DATE")
    protected LocalDateTime updatedDate;

    @PrePersist
    private void prePersist() {
            this.active = true;
    }
}
