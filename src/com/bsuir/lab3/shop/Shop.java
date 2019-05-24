package com.bsuir.lab3.shop;

import com.bsuir.lab3.vessel.liquid.Liquid;

public class Shop {
    public Liquid issueGoods(Liquid liquid){
        return serveBuyer(liquid);
    }
    private Liquid serveBuyer(Liquid liquid){
        return liquid;
    }
}
