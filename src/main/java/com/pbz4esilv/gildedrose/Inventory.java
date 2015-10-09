package com.pbz4esilv.gildedrose;

public class Inventory {

    private Item[] items;

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        items = new Item[]{
                new Normal("+5 Dexterity Vest", 10, 20),
                new Cheese("Aged Brie", 2, 0),
                new Normal("Elixir of the Mongoose", 5, 7),
                new Legendary("Sulfuras, Hand of Ragnaros", 0, 80),
                new Pass("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Conjured("Conjured Mana Cake", 3, 6)
        };
    }
}