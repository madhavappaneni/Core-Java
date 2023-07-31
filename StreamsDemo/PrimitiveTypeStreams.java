package StreamsDemo;

import java.util.stream.IntStream;

public class PrimitiveTypeStreams {

    public static void main(String[] args) {

        System.out.println("Int Stream");
        IntStream.of(1, 2, 3);

        IntStream.rangeClosed(1, 5).forEach(System.out::println);

        IntStream.range(1, 5).forEach(System.out::println);

        ;
    }
}
