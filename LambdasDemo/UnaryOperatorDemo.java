package LambdasDemo;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> sq = n -> n * n;
        UnaryOperator<Integer> inc = n -> n + 1;

        var res = inc.andThen(sq).apply(10);
        System.out.println(res);

        
    }
}
