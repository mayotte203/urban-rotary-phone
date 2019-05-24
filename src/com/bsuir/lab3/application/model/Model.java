package com.bsuir.lab3.application.model;

import com.bsuir.lab3.human.Human;
import com.bsuir.lab3.shop.Shop;
import com.bsuir.lab3.vessel.*;
import com.bsuir.lab3.vessel.liquid.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Model {
    final private String humanDefaultName = "Human";
    private Shop shop = new Shop();
    private Human human;
    private ObservableList<Human> humansList = FXCollections.observableArrayList();
    private Bottle bottle = new Bottle();
    private Cup cup = new Cup();
    private Juice juice = new Juice();
    private Water water = new Water();
    private Tea tea = new Tea();
    private Coffe coffe = new Coffe();
    public String getHumanName() {
        if(human == null)
        {
            return null;
        }
        return human.getName();
    }
    public void setHumanName(String name) {
        if(human != null) {
            human.setName(name);
        }
    }
    public void humanPourLiquidToCup() {
        if(human != null)
        human.pourLiquid(bottle, cup);
    }
    public void humanPourLiquidToBottle() {
        if(human != null)
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
        if(human != null)
        human.drink(bottle);
    }
    public void humanDrinkFromCup() {
        if(human != null)
        human.drink(cup);
    }
    public void cupPourOut() {
        cup.pourOut();
    }
    public void bottlePourOut() {
        bottle.pourOut();
    }
    public String getHumanLiquidString() {
        if (human == null)
        {
            return null;
        }
        return human.getLiquidString();
    }
    public void humanBuyLiquid(Shop shop, Liquid liquid) {
        if(human != null)
        human.buyLiquid(shop, liquid);
    }
    public void humanBuyCoffee(){
        humanBuyLiquid(shop, new Coffe());
    }
    public void humanBuyWater(){
        humanBuyLiquid(shop, new Water());
    }
    public void humanBuyTea(){
        humanBuyLiquid(shop, new Tea());
    }
    public void humanBuyJuice(String taste){
        juice = new Juice();
        juice.setTaste(taste);
        humanBuyLiquid(shop, juice);
    }
    public ObservableList getHumansList(){
        return humansList;
    }
    public void addHuman(){
        humansList.add(new Human(humanDefaultName));
    }
    public void removeHuman(int value){
        humansList.remove(value);
    }
    public void setCurrentHuman(int value){
        if(value != -1) {
            human = humansList.get(value);
        }
        else{
            human = null;
        }
    }
}
