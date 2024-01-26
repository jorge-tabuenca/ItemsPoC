package com.items.ItemsPoC.controller.impl;

import com.items.ItemsPoC.controller.ItemController;
import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;
import com.items.ItemsPoC.service.ItemService;
import com.items.ItemsPoC.service.impl.ItemServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("items")
public class ItemControllerImpl implements ItemController {

    private final ItemService itemService = new ItemServiceImpl();

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/saludar")
    public String saluda() { return "Hola Mundo"; }

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
}
