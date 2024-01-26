package com.items.ItemsPoC.entity.enums;

public enum ItemTypeEnum {

    DRINK("Bebida"),
    FOOD("Comida"),
    SAUCE("Salsa"),
    SPECIAL("Especial");

    private final String message;

    ItemTypeEnum(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
