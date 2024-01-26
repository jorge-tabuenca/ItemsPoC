package com.items.ItemsPoC.controller;

import com.items.ItemsPoC.dto.ItemDto;
import com.items.ItemsPoC.entity.ItemEntity;

public interface ItemController {

    ItemEntity getItem(short itemId) throws Exception;

    ItemEntity createItem(ItemDto itemDto) throws Exception;

}
