package dat159.gildedrose;

public class Sulfuras extends Item{
	
	public Sulfuras(String name, int sellIn, int quality) {
		super("Sulfuras", sellIn, quality);
	}
	
	@Override
	public void updateQtyOnQty() {
		quality++;
	}
	
	@Override
	public void updateSellIn() {
		
	}

}
