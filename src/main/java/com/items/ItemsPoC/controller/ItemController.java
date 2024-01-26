package com.items.ItemsPoC.controller;

import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;

public interface ItemController {

    ItemEntity getItem(short itemId) throws Exception;

    ItemEntity createItem(ItemDTO itemDto) throws Exception;

}
