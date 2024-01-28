package com.items.ItemsPoC.service;

import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;

import java.util.List;

public interface ItemService {

    ItemEntity getItem(short itemId) throws Exception;

    ItemEntity createItem(ItemDTO itemDTO) throws Exception;

    List<ItemEntity> getAllItems() throws Exception;

    ItemEntity updateItem(short itemId, ItemDTO itemDTO) throws Exception;

    ItemEntity deleteItem(short itemId) throws Exception;

}
