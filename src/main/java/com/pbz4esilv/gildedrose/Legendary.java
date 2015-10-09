package com.pbz4esilv.gildedrose;

public class Legendary extends Item implements Quality {

    public Legendary (String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }

    public int UpdateQuality(){
        this.setSellIn(this.getSellIn() - 1);

        return this.getQuality();
    }
}
