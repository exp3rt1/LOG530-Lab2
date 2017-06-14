
public class ChildrensMovie extends Movie {

    public ChildrensMovie(String title, int priceCode, int daysRented) {
        super(title, priceCode, daysRented);
    }

    public double calculatePrice(Movie movie, double amount) {
        amount += 1.5;
        if(movie.getDaysRented() > 3)
            amount += (movie.getDaysRented() - 3) * 1.5;
        return amount;
    }

    public int calculateFrequentRenterPoints() {
        return 0;
    }
}
