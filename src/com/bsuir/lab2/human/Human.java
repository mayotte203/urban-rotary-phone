package com.bsuir.lab2.human;

import com.bsuir.lab2.vessel.Vessel;

public class Human {
    private String name;
    public Human(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void pourLiquid(Vessel from, Vessel to) {
        to.fill(from.pourOut());
    }
    public void drink(Vessel vessel) {
        vessel.pourOut();
    }
}
