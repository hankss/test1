package com.hai.postgresql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Embeddable
public class SysUserProcessId implements Serializable {
    private static final long serialVersionUID = -7629973076240088831L;
    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "process_id", nullable = false)
    private UUID processId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SysUserProcessId entity = (SysUserProcessId) o;
        return Objects.equals(this.processId, entity.processId) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processId, userId);
    }

}