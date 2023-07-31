package LambdasDemo;

public class LambdasDemo {

    public static String clPrefix = "+";
    public String instPrefix = "+";

    public LambdasDemo(String message) {

    }

    public LambdasDemo() {

    }

    public static void main(String[] args) {
        // greet(new ConsolePrinter());

        // Anonymous inner class
        greet(new Printer() {
            public void print(String message) {
                System.out.println(message);
            }
        });

        // Using lambda expression - first attempt
        greet((String message) -> {
            System.out.println(message);
        });

        String prefix = "-";
        // Using lambda expression
        // Can't use instance variables, can't access state
        // Can use only local variables or static variables of the class
        // Can access instance method in instance functions
        // In the lambda expressions, 'this' references to enclosing object
        greet((message) -> System.out.println(prefix + clPrefix + message));

        // rewriting using method reference
        greet(System.out::println);

        // Lambda using method reference to print
        greet(LambdasDemo::print);

        // Lambda using object reference to print
        var demo = new LambdasDemo();
        greet(demo::printInstance);

        // Lamba to send parameter to Constructor
        greet(LambdasDemo::new);
    }

    public static void print(String message) {
    }

    public void printInstance(String message) {
    }

    public static void greet(Printer printer) {
        printer.print("hello world");
    }
}
