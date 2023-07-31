package ExceptionsDemo;

class TestClass {
    static String getString() {
        return null;
    }
}

public class UncheckedExceptionsDemo {
    public static void main(String[] args) {
        String name = TestClass.getString();
        System.out.println(name.toUpperCase());
        // Unchecked exceptions - Null Pointer exception s
    }
}
