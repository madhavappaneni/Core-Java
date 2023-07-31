package StreamsDemo;

import java.util.Comparator;
import java.util.List;

public class ReducersDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 15),
                new Movie("C", 20),
                new Movie("C", 20));

        System.out.println("Count");
        System.out.println(movies.stream().count());

        System.out.println("Any Match");
        System.out.println(movies.stream().anyMatch(m -> m.getLikes() > 20));

        System.out.println("All Match");
        System.out.println(movies.stream().allMatch(m -> m.getLikes() > 20));

        System.out.println("None Match");
        System.out.println(movies.stream().noneMatch(m -> m.getLikes() > 20));

        System.out.println("Find First");

        var results = movies.stream().findFirst().get();
        System.out.println(results.getTitle());

        System.out.println("Max");
        System.out.println(movies.stream().max(Comparator.comparing(Movie::getLikes)).get());
    }
}
