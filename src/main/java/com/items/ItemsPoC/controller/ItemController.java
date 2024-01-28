package com.items.ItemsPoC.controller;

import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;

import java.util.List;

public interface ItemController {

    ItemEntity getItem(short itemId) throws Exception;

    ItemEntity createItem(ItemDTO itemDto) throws Exception;

    List<ItemEntity> getAllItems() throws Exception;

    ItemEntity updateItem(short itemId, ItemDTO itemDTO) throws Exception;

    ItemEntity deleteItem(short itemId) throws Exception;

}
