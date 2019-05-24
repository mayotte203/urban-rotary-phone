package com.bsuir.lab3.vessel.liquid;

public class Liquid {
    private int volume = 0;

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String getInfoString(){
        return new String("Liquid");
    }
}
