package com.items.ItemsPoC.entity;

import com.items.ItemsPoC.entity.enums.ItemTypeEnum;
import com.items.ItemsPoC.entity.enums.PackagingEnum;
import com.items.ItemsPoC.entity.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Items")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private short id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "TYPE")
    private ItemTypeEnum type;

    @Column(name = "PACKAGING")
    private PackagingEnum packaging;

    @Column(name = "CAPACITY")
    private int capacity;

    @Column(name = "FRIDGE")
    private boolean fridge;

    @Column(name = "DATE")
    private String date;

    @Column(name = "STATUS")
    private StatusEnum status;

    @Column(name = "CUSTOMER")
    private String customer;

}
