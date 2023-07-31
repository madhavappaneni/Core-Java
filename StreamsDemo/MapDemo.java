package StreamsDemo;

import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("A", 10),
                new Movie("B", 15),
                new Movie("C", 20));

        movies.stream().map(movie -> movie.getTitle()).forEach(movie -> System.out.println(movie));

        // primitive methods - mapToInt, mapToDouble, etc
        movies.stream().mapToInt(movie -> movie.getLikes()).forEach(like -> System.out.println(like));

        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        // Flat map
        stream.forEach(list -> System.out.println(list));
        // [1, 2, 3]
        // [4, 5, 6]
        var stream2 = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream2.flatMap(list -> list.stream())
                .forEach(list -> System.out.println(list));

    }
}
