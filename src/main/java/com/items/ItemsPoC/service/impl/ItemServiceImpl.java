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

import java.util.List;

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

    @Override
    public List<ItemEntity> getAllItems() throws Exception {
        return this.itemRepository.findAll();
    }

    @Override
    public ItemEntity updateItem(short itemId, ItemDTO itemDTO) throws Exception {

        ItemEntity itemEntity =
                this.itemRepository.findById(itemId)
                        .orElseThrow(() -> new Exception("Item Not Found"));

//        itemEntity.setName(itemDTO.getName());
//        itemEntity.setType(itemDTO.getType());
//        itemEntity.setPackaging(itemDTO.getPackaging());
//        itemEntity.setCapacity(itemDTO.getCapacity());
//        itemEntity.setFridge(itemDTO.isFridge());
//        itemEntity.setDate(itemDTO.getDate());
//        itemEntity.setStatus(itemDTO.getStatus());
//        itemEntity.setCustomer(itemDTO.getCustomer());

        try {
            itemEntity = this.itemRepository.save(itemEntity);
        }catch (final Exception e){
            throw new Exception("ERROR TO UPDATE ITEM");
        }
        return itemEntity;
    }

    @Override
    public ItemEntity deleteItem(short itemId) throws Exception {

        ItemEntity itemEntity =
                this.itemRepository.findById(itemId)
                        .orElseThrow(() -> new Exception("Item Not Found"));

        try {
            this.itemRepository.delete(itemEntity);
        }catch (final Exception e){
            throw new Exception("ERROR TO DELETE ITEM");
        }
        return itemEntity;
    }
}
