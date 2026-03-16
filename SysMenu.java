package com.hai.postgresql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "sys_menu")
public class SysMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "menu_name", nullable = false, length = 50)
    private String menuName;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "order_num")
    private Integer orderNum;

    @Column(name = "path")
    private String path;

    @Column(name = "component")
    private String component;

    @Column(name = "menu_type", length = 10)
    private String menuType;

    @Column(name = "perms", length = 100)
    private String perms;

    @Column(name = "icon", length = 100)
    private String icon;

    @Column(name = "visible")
    private Integer visible;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "status")
    private Integer status;

    @Column(name = "created_by", length = 50)
    private String createdBy;

    @Column(name = "updated_by", length = 50)
    private String updatedBy;

    @Column(name = "updated_at")
    private Instant updatedAt;

}