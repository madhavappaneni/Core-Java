package InnerClass;

public class DemoStaticInnerClass {
    static int data = 30;

    static class TestInnerClass {
        static void someFunction() {
            System.out.println("Inner function: " + data);
        }
    }

    public static void main(String[] args) {
        // DemoStaticInnerClass.TestInnerClass t = new
        // DemoStaticInnerClass.TestInnerClass();
        // t.someFunction();

        DemoStaticInnerClass.TestInnerClass.someFunction();
    }
}