package com.pbz4esilv.gildedrose;

public class Cheese extends Item implements Quality {

    public Cheese (String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }

    public int UpdateQuality(){
        int sellInTemp = getSellIn();

        if (50 > this.getQuality() && this.getQuality() >= 0){
            this.setQuality(this.getQuality() + 1);
            sellInTemp = sellInTemp - 1;
            this.setSellIn(sellInTemp);
        }

        return this.getQuality();
    }
}
