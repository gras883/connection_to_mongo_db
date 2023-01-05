package com.example.demo6.constants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderStatus {
    Completed(1, "Completed"),
    Failed(2, "Failed");

    private Integer value;
    private String name;
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
