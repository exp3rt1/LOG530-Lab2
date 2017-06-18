
public class RegularMovie extends Movie {

    public RegularMovie(String title, int priceCode, int daysRented) {
        super(title, priceCode, daysRented);
    }

    public double calculatePrice(Movie movie, double amount) {
        amount += 2;
        if(movie.getDaysRented() > 2)
            amount += (movie.getDaysRented() - 2)*1.5;
        return amount;
    }

    public int calculateFrequentRenterPoints() {
        return 0;
    }
}
