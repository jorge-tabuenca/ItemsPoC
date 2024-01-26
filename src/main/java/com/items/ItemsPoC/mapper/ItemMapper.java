package com.items.ItemsPoC.mapper;

import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDTO mapToItem(ItemEntity itemEntity);

//    @Mapping(source = "itemId", target = "id")
//    ItemEntity mapToItemDTO(ItemDTO itemDTO, short itemId);

    ItemEntity mapToItemDTO(ItemDTO itemDTO);

}
