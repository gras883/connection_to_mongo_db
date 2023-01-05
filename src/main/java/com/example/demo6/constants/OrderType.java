package com.example.demo6.constants;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum OrderType {
    RAIL("Rail"),
    FLIGHT("Flight"),
    BUS("Bus"),
    HOTEL("Hotel");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
