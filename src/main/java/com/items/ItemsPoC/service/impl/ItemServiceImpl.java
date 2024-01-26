package com.items.ItemsPoC.service.impl;

import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;
import com.items.ItemsPoC.mapper.ItemMapper;
import com.items.ItemsPoC.mapper.ItemMapperImpl;
import com.items.ItemsPoC.repository.ItemRepository;
import com.items.ItemsPoC.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemMapper itemMapper = new ItemMapperImpl();

    private ItemRepository itemRepository;

    @Override
    public ItemEntity getItem(short itemId) throws Exception {

        return this.itemRepository
                .findById(itemId)
                .orElseThrow(() -> new Exception("ITEM NOT FOUND"));

    }

    @Override
    public ItemEntity createItem(ItemDTO itemDTO) throws Exception {

        ItemEntity itemEntity = this.itemMapper.mapToItemDTO(itemDTO);

        try {
            itemEntity = this.itemRepository.save(itemEntity);
        }catch (final Exception e){
            throw new Exception("ERROR TO CREATE ITEM");
        }
        return itemEntity;

    }
}
