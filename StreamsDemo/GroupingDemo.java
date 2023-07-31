package StreamsDemo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("B", 25, Genre.ACTION),
                new Movie("B", 10, Genre.ACTION),
                new Movie("A", 15, Genre.THRILLER),
                new Movie("C", 20, Genre.ACTION));

        var groupedMovies = movies.stream().collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(groupedMovies);

    }
}
