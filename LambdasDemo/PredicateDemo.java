package LambdasDemo;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // IntPredicate isLongerThan5 = num -> num > 5;
        // var result = isLongerThan5.test(10);
        // System.out.println(result);

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");
        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
        var result = hasLeftAndRightBraces.test("{TestIng}");

        hasLeftBrace.or(hasRightBrace);

        hasLeftBrace.negate();

        System.out.println(result);
    }
}
