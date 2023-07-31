package StreamsDemo;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 15),
                new Movie("C", 20));

        // var result = movies.stream().filter(m -> m.getLikes() > 10)
        // .collect(Collectors.toMap(m -> m.getTitle(), m -> m.getLikes()));

        var result = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));

        // var resultVal = movies.stream().filter(m -> m.getLikes() > 10)
        // .collect(Collectors.toMap(Movie::getTitle, m -> m));
        var resultVal = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(result);
        System.out.println(resultVal);

        var resultSum = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println(resultSum);

        var resultSummarizing = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(resultSummarizing);

        String resultJoining = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(resultJoining);

    }
}
