package StreamsDemo;

import java.util.List;
import java.util.Optional;

public class StreamReductionDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 15),
                new Movie("C", 20));

        // Optional<Integer> sum = (movies.stream().map(m -> m.getLikes()).reduce((a, b)
        // -> a + b));

        Optional<Integer> sum = (movies.stream().map(m -> m.getLikes()).reduce(Integer::sum));

        var defaultSum = (movies.stream().map(m -> m.getLikes()).reduce(0, Integer::sum));

        System.out.println(sum.orElse(0));

        System.out.println(defaultSum); // no need for extra handling
    }
}
