package com.items.ItemsPoC.service;

import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;

public interface ItemService {

    ItemEntity getItem(short itemId) throws Exception;

    ItemEntity createItem(ItemDTO itemDTO) throws Exception;

}
