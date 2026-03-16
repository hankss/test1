package com.hai.postgresql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "sys_process")
public class SysProcess {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "business_id", nullable = false)
    private SysBusiness business;

    @Column(name = "proc_id", nullable = false, length = 50)
    private String procId;

    @Column(name = "proc_name", nullable = false, length = 100)
    private String procName;

    @Column(name = "qty_target")
    private Integer qtyTarget;

    @Column(name = "status")
    private Integer status;

    @Column(name = "created_by", length = 50)
    private String createdBy;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_by", length = 50)
    private String updatedBy;

    @Column(name = "updated_at")
    private Instant updatedAt;

}