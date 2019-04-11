package com.bsuir.lab3.human;

import com.bsuir.lab3.shop.Shop;
import com.bsuir.lab3.vessel.Vessel;
import com.bsuir.lab3.vessel.liquid.Liquid;

public class Human {
    private String name;
    private Liquid liquid;
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
        liquid = vessel.pourOut();
    }
    public void buyLiquid(Shop shop, Liquid liquid){
        this.liquid = shop.serveBuyer(liquid);
    }
}
