package com.bsuir.lab3.application.model;

import com.bsuir.lab3.human.Human;
import com.bsuir.lab3.shop.Shop;
import com.bsuir.lab3.vessel.*;
import com.bsuir.lab3.vessel.liquid.*;


public class Model {
    final private String humanDefaultName = "Human";
    private Shop shop = new Shop();
    private Human human = new Human(humanDefaultName);
    private Bottle bottle = new Bottle();
    private Cup cup = new Cup();
    private Juice juice = new Juice();
    private Water water = new Water();
    private Tea tea = new Tea();
    private Coffe coffe = new Coffe();
    public String getHumanName() {
        return human.getName();
    }
    public void setHumanName(String name) {
        human.setName(name);
    }
    public void humanPourLiquidToCup() {
        human.pourLiquid(bottle, cup);
    }
    public void humanPourLiquidToBottle() {
        human.pourLiquid(cup, bottle);
    }
    public String getBottleContentString() {
        return bottle.getContentString();
    }
    public String getCupContentString() {
        return cup.getContentString();
    }
    public void cupPourWater() {
        cup.fill(water);
    }
    public void cupPourJuice() {
        cup.fill(juice);
    }
    public void bottlePourWater() {
        bottle.fill(water);
    }
    public void bottlePourJuice() {
        bottle.fill(juice);
    }
    public void setJuiceTaste(String taste) {
        juice = new Juice();
        juice.setTaste(taste);
    }
    public void humanDrinkFromBottle() {
        human.drink(bottle);
    }
    public void humanDrinkFromCup() {
        human.drink(cup);
    }
    public void cupPourOut() {
        cup.pourOut();
    }
    public void bottlePourOut() {
        bottle.pourOut();
    }
}
