package dat159.fowler;

public class Childrens extends Movie {

	public Childrens(String title) {
		super(title, 2);
	}
	
	public double getPrice(int daysRented) {
		double amount = 1.5;
		
		if(daysRented > 3) {
			amount += (daysRented - 3) * 1.5;
		}
		return amount;
	}
}
