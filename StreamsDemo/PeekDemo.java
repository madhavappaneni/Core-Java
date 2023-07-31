package StreamsDemo;

import java.util.List;

public class PeekDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 15),
                new Movie("C", 20),
                new Movie("C", 20));
        System.out.println("normal");
        movies.stream().filter(m -> m.getLikes() > 10).map(Movie::getTitle).forEach(System.out::println);
        System.out.println("peek");
        // Peek is intermediate operation, forEach is terminal operator
        movies.stream().filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("Filtered Movie: " + m))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("Filtered Title: " + t))
                .forEach(System.out::println);

    }
}
