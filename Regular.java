package dat159.fowler;

public class Regular extends Movie{
	
	public Regular (String title) {
		super(title, 0);
	}
	
	
	public double getPrice(int daysRented) {
		double amount = 2;
		
		if (daysRented > 2) {
			amount += (daysRented - 2) *1.5;
		}
		return amount;
	}

}
