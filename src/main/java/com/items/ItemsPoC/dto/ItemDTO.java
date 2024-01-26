package com.items.ItemsPoC.dto;

import com.items.ItemsPoC.entity.enums.ItemTypeEnum;
import com.items.ItemsPoC.entity.enums.PackagingEnum;
import com.items.ItemsPoC.entity.enums.StatusEnum;
import lombok.Data;

@Data
public class ItemDTO {

    private String name;

    private ItemTypeEnum type;

    private PackagingEnum packaging;

    private int capacity;

    private boolean fridge;

    private String date;

    private StatusEnum status;

    private String customer;

}
