package com.bsuir.lab2.vessel;

import com.bsuir.lab2.vessel.liquid.*;

public class Vessel {
    private Integer volume = 0;
    private Liquid liquid;
    public  Integer getVolume()
    {
        return volume;
    }
    public void setVolume(Integer volume)
    {
        this.volume = volume;
    }
    public Liquid pourOut()
    {
        Liquid liquid = this.liquid;
        this.liquid = null;
        return liquid;
    }
    public void fill(Liquid liquid)
    {
        this.liquid = liquid;
    }
    public String getContentString()
    {
        if(liquid == null)
        {
            return new String("Empty");
        }
        return liquid.toString();
    }
}
