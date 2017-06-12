import java.util.Enumeration;
import java.util.Vector;


public class Customer {
	private String _name;
    private int _frequentRenterPoints;
	private Vector _movies = new Vector();
	
	public Customer (String name) {
		_name = name;
        _frequentRenterPoints = 0;
	}
	
	public void add(Movie movie) {
        _movies.addElement(movie);
	}

	public String getName() {
		return _name;
	}

    public int getFrequentRenterPoints() {
        return _frequentRenterPoints;
    }

    public void addFrequentRenterPoints(int quantity) {
        _frequentRenterPoints += quantity;
    }
	
	public void calculateBill() {
		double totalAmount = 0;
		Enumeration movies = _movies.elements();

		while(movies.hasMoreElements()){
			double thisAmount = 0;
			Movie movie = (Movie) movies.nextElement();

            movie.calculatePrice(movie, thisAmount);

            addFrequentRenterPoints(1);
            movie.calculateFrequentRenterPoints();

			totalAmount += thisAmount;
			
		}

		printDetails(movies, totalAmount);
	}

    public String printDetails(Enumeration movies, double amount) {
        String result = "Rental Record for " + getName() +"\n";
        while(movies.hasMoreElements()) {
            Movie movie = (Movie) movies.nextElement();

            result += "\t" + movie.getTitle() + "\t" + String.valueOf(amount) + "\n";
        }

        result += "Amount owed is " + String.valueOf(amount) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + "frequent renter points";

        return result;
    }
}
