package com.company;

public enum ColorEnums {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    MAGENTA("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private final String field;

    ColorEnums(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
