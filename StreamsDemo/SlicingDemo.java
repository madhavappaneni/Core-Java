package StreamsDemo;

import java.util.List;

public class SlicingDemo {
    public static void main(String[] args) {
        // Limit
        // skip
        // takeWhile(predicate)
        // dropWhile(predicate)
        List<Movie> movies = List.of(
                new Movie("A", 10),
                new Movie("B", 15),
                new Movie("C", 20));

        // skip and limit could be used for pagination kind of flow
        movies.stream().limit(3).forEach(m -> System.out.println(m));

        movies.stream().skip(2).forEach(m -> System.out.println(m));

        System.out.println("Take While");

        movies.stream().takeWhile(m -> m.getLikes() < 16).forEach(m -> System.out.println(m));

    }
}
