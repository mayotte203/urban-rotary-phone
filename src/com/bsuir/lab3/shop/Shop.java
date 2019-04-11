package com.bsuir.lab3.shop;

import com.bsuir.lab3.vessel.liquid.Liquid;

public class Shop {
    private Liquid issueGoods(Liquid liquid){
        return liquid;
    }
    public Liquid serveBuyer(Liquid liquid){
        return this.issueGoods(liquid);
    }
}
