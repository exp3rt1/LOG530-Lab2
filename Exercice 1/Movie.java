
public abstract class Movie {
	
	private String _title;
	private int _priceCode;
	private int _daysRented;
	
	public Movie(String title, int priceCode, int daysRented){
		_title = title;
		_priceCode = priceCode;
		_daysRented = daysRented;
	}
	
	public int getPriceCode(){
		return _priceCode;
	}

	public String getTitle(){
		return _title;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public abstract double calculatePrice(Movie movie, double amount);

	public abstract int calculateFrequentRenterPoints();
}