package com.bsuir.lab3.vessel.liquid;

public class Liquid {
    private Integer volume = 0;

    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public String getInfoString(){
        return new String("Liquid");
    }
}
