package com.items.ItemsPoC.controller.impl;

import com.items.ItemsPoC.controller.ItemController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class ItemControllerImpl implements ItemController {

    @GetMapping("/saludar")
    public String saluda() { return "Hola Mundo"; }

}
