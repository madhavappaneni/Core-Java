package LambdasDemo;

import java.util.function.IntBinaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorDemo {

    public static void main(String[] args) {
        var x = 1 + 2;
        BinaryOperator<Integer> add = (a, b) -> a + b;

        Function<Integer, Integer> square = a -> a * a;

        var result = add.andThen(square).apply(10, 9);
        System.out.println(result);
    }
}
