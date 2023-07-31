package StreamsDemo;

import java.util.List;
import java.util.function.Predicate;

public class FilterDemo {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("A", 10),
                new Movie("B", 15),
                new Movie("C", 20));

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .forEach(m -> System.out.println(m));
        // Intermediate Operations
        // map(), filter() - Can continue to transforming that pipe to get the data we
        // want
        // Terminal operation
        // Foreach -
        // Without applying a terminal operation, a stream won't do anything

        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
        movies.stream().filter(isPopular).forEach(m -> System.out.println(m));
    }
}
