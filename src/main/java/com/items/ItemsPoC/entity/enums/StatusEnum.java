package com.items.ItemsPoC.entity.enums;

public enum StatusEnum {

    WAITING("WAITING"),
    CREATED("CREATED"),
    DELETED("DELETED");

    private final String message;

    StatusEnum(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
