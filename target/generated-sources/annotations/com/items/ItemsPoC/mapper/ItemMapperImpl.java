package com.items.ItemsPoC.mapper;

import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-28T12:59:44+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public ItemDTO mapToItem(ItemEntity itemEntity) {
        if ( itemEntity == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        return itemDTO;
    }

    @Override
    public ItemEntity mapToItemDTO(ItemDTO itemDTO) {
        if ( itemDTO == null ) {
            return null;
        }

        ItemEntity itemEntity = new ItemEntity();

        return itemEntity;
    }
}
