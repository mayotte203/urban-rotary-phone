package com.bsuir.lab3.vessel;

import com.bsuir.lab3.vessel.liquid.*;

public class Vessel {
    private int volume = 0;
    private Liquid liquid;

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public Liquid pourOut() {
        Liquid liquid = this.liquid;
        this.liquid = null;
        return liquid;
    }
    public void fill(Liquid liquid)
    {
        this.liquid = liquid;
    }
    public String getContentString() {
        if(liquid == null)
        {
            return new String("Empty");
        }
        return liquid.getInfoString();
    }
}
