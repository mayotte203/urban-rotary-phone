package com.bsuir.lab3.vessel;

public class Bottle extends Vessel {
    public void open(){
        cap = false;
    }
    public  void close(){
        cap = true;
    }
    public Boolean isClosed(){
        return cap;
    }
    private Boolean cap = false;
}
