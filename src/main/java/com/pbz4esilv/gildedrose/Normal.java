package com.pbz4esilv.gildedrose;

public class Normal extends Item implements Quality{

    public Normal (String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }

    public int UpdateQuality(){

        if (50 >= this.getQuality() && this.getQuality() >= 2){
            this.setQuality(this.getQuality() - 1);

            if (this.getSellIn()<=0) {
                this.setQuality(this.getQuality() - 1);
            }
            this.setSellIn(this.getSellIn()-1);
        }
        return this.getQuality();
    }
}
