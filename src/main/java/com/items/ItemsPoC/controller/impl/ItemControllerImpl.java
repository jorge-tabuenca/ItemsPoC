package com.items.ItemsPoC.controller.impl;

import com.items.ItemsPoC.controller.ItemController;
import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;
import com.items.ItemsPoC.service.ItemService;
import com.items.ItemsPoC.service.impl.ItemServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("items")
public class ItemControllerImpl implements ItemController {

    private final ItemService itemService = new ItemServiceImpl();

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/test")
    public String test() { return "Hola Mundo"; }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/item/{itemId}")
    public ItemEntity getItem(short itemId) throws Exception {
        return itemService.getItem(itemId);
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/item")
    public ItemEntity createItem(@RequestBody ItemDTO itemDto) throws Exception {
        return itemService.createItem(itemDto);
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/item")
    public List<ItemEntity> getAllItems() throws Exception {
        return itemService.getAllItems();
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/item")
    public ItemEntity updateItem(short itemId, ItemDTO itemDTO) throws Exception {
        return updateItem(itemId, itemDTO);
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/item/{itemId}")
    public ItemEntity deleteItem(short itemId) throws Exception {
        return deleteItem(itemId);
    }
}
