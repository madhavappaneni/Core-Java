package StreamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("A", 10),
                new Movie("B", 15),
                new Movie("C", 20));

        int count = 0;

        // Imperative programming
        // Others - Declarative, Functional, Object Oriented, Event Driven
        // for (var movie : movies) {
        // if (movie.getLikes() > 10) {
        // count += 1;
        // }
        // }
        // System.out.println(count);

        // Declarative/Functional programming
        System.out.println(movies.stream().filter(movie -> movie.getLikes() >= 10).count());

        // CREATING A STREAM
        // 1. From Collections
        // Every class that implements Collections interface, has a stream method
        // Collection<Integer> x;
        // x.stream();
        // var list = new ArrayList<>();
        // list.stream()

        // 2. From Arrays
        int[] numbers = { 1, 2, 3 };
        // numbers.stream -- doesn't work
        Arrays.stream(numbers); // Work around
        Arrays.stream(numbers).forEach(n -> System.out.println(n));

        // 3. From an arbitrary number of object
        Stream.of(1, 2, 3, 4);
        // 4. From Finite/Infinite
        var stream = Stream.generate(() -> Math.random()); // lazy evaluation
        stream.limit(10).forEach(n -> System.out.println(n)); // finite stream
        // stream.forEach(n -> System.out.println(n)); // infinite stream

        Stream.iterate(1, n -> n + 1).limit(10).forEach(n -> System.out.println(n));
        ;
    }

}
