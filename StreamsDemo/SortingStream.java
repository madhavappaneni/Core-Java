package StreamsDemo;

import java.util.Comparator;
import java.util.List;

public class SortingStream {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("B", 10),
                new Movie("A", 15),
                new Movie("C", 20));
        System.out.println("Sort by movie title general way");
        movies.stream()
                .sorted((a, b) -> (a.getTitle().compareTo(b.getTitle())))
                .forEach(System.out::println);
        System.out.println("Sort by movie title better way");
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(System.out::println);

        System.out.println("Sort by movie title reveresed");
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(System.out::println);
    }

}
