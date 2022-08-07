package Day26_Statics.MovieTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieTester {
    public static void main(String[] args) {
        Movie starWars = new Movie("USA", "StarWars", "Sci-Fi", LocalDate.of(2000, 1, 1), "Luke Skywalker");

        ArrayList<String> starWarsCast = new ArrayList<>();
        starWarsCast.addAll(Arrays.asList("Ozzy", "Muhtar", "Kuzzat", "Ali"));
        starWars.cast=starWarsCast;
        System.out.println(starWars.toString());
    }
}
