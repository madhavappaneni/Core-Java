package LambdasDemo;

import java.util.List;
import java.util.function.Consumer;

public class ConsumersDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        // Imperative programming (for, if/else, switch/case)
        // Others - Functional, Object Oriented, Event Driven
        for (var item : list) {
            System.out.println(item);
        }

        list.forEach((Integer item) -> {
            System.out.println(item);
        });

        // Declarative programming.
        // Tell what to do, not how to do it.
        list.forEach((item) -> System.out.println(item));


        // Chaining Consumer
        List<String> list2 = List.of("a", "b", "c");

        Consumer<String> print = item -> System.out.println(item);

        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        list2.forEach(print.andThen(printUpperCase).andThen(print));
    }
}
