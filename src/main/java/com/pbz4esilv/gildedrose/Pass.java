package com.pbz4esilv.gildedrose;

public class Pass extends Item implements Quality {

    public Pass(String name, int sellIn, int quality){
        super( name, sellIn, quality);
    }

    public int UpdateQuality(){

        if (this.getSellIn() >= 0) {
            if (50 > this.getQuality() + 3 && this.getQuality() > 0) {
                this.setQuality(this.getQuality() + 1);

                if (this.getSellIn() <= 10) {
                    this.setQuality(this.getQuality() + 1);

                    if (this.getSellIn() <= 5) {
                        this.setQuality(this.getQuality() + 1);
                        }
                    }
                }
            }

        else {
        this.setQuality(0);
        }

        this.setSellIn(this.getSellIn()-1);
        return this.getQuality();
    }
}
