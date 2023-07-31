package StreamsDemo;

import java.util.List;

public class DistinctDemo {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 15),
                new Movie("C", 20),
                new Movie("C", 20));
        System.out.println("Repetitive");
        movies.stream().map(Movie::getLikes).forEach(System.out::println);

        System.out.println("Distinct");
        movies.stream().map(Movie::getLikes).distinct().forEach(System.out::println);

    }
}
