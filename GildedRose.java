package dat159.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    	
    	for(Item item : items) {
    		item.updateQtyOnQty();
    		item.updateQtyOnSellIn();
    		item.updateSellIn();
    	}
    }
}
    	
      