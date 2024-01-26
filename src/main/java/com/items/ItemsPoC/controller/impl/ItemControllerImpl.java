package com.items.ItemsPoC.controller.impl;

import com.items.ItemsPoC.controller.ItemController;
import com.items.ItemsPoC.dto.ItemDTO;
import com.items.ItemsPoC.entity.ItemEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class ItemControllerImpl implements ItemController {

    @GetMapping("/saludar")
    public String saluda() { return "Hola Mundo"; }

    @Override
    @GetMapping("/item/{itemId}")
    public ItemEntity getItem(short itemId) throws Exception {
        return null;
    }

    @Override
    @PostMapping("/item")
    public ItemEntity createItem(ItemDTO itemDto) throws Exception {
        return null;
    }
}
