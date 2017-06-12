/**
 * Created by Oli on 2017-06-11.
 */
public class Release extends Movie {

    public Release(String title, int priceCode, int daysRented) {
        super(title, priceCode, daysRented);
    }

    public double calculatePrice(Movie movie, double amount){
        amount += movie.getDaysRented() * 3;

        return amount;
    }

    // add bonus for two day new release rental
    public int calculateFrequentRenterPoints() {
        int points = 0;

        if(getDaysRented() > 1) {
            points++;
        }

        return points;
    }
}
