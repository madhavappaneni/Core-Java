package LambdasDemo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> getRandom = () -> Math.random();

        // Lazy evaluation
        System.out.println(getRandom.get());
        System.out.println(getRandom.get());
        System.out.println(getRandom.get());
    }
}
