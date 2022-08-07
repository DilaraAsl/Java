package Day26_Statics.MovieTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {
   public String country, title, Genre;
   public LocalDate releaseDate;
   public String director;
   ArrayList<String> cast=new ArrayList<>();

    public Movie(String country, String title, String genre, LocalDate releaseDate, String director) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String cst){
        cast.add(cst);
    }
    public void addCast(ArrayList<String> cst){
        cast.addAll(cst);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", releaseDate=" + releaseDate +
                ", director='" + director + '\'' +
                "Total no of cast: "+cast.size()+
                '}';
    }
}
