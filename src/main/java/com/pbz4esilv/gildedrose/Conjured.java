package com.pbz4esilv.gildedrose;

public class Conjured extends Item implements Quality {

    public Conjured(String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }

    public int UpdateQuality(){

        if (50 >= this.getQuality() && this.getQuality() >= 4){
            this.setQuality(this.getQuality() - 2);

            if (this.getSellIn()<=0) {
                this.setQuality(this.getQuality() - 2);
            }
            this.setSellIn(this.getSellIn()-1);
        }
        return this.getQuality();
    }
}
