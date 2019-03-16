package com.bsuir.lab2.vessel.liquid;

public class Juice extends Liquid {
    private String taste = new String("");
    public String getTaste() {
        return  taste;
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }
    public String getInfoString(){
        return new String("Juice. Taste: " + taste);
    }
}
