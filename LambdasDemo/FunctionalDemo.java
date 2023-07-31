package LambdasDemo;

import java.util.function.Function;

public class FunctionalDemo {
    public static void main(String[] args) {
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);

        // Example of declarative programming.
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + '}';

        var result = replaceColon
                .andThen(addBraces)
                .apply("Key:Value");
        System.out.println(result);

        var result2 = addBraces.compose(replaceColon).apply("Key:Value");
        System.out.println(result2);
    }
}
