package com.items.ItemsPoC.entity.enums;

public enum PackagingEnum {

    BOTTLE("Botella"),
    BOX("Box");

    private final String message;

    PackagingEnum(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
