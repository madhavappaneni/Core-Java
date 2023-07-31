// local variable
// A variable declared inside the body of a method is called local variable. Other methods in the classess won't be aware this variable exists
// instance variable
// A variable declared inside the class but outside the body of the method is called an instance variable. It is not declared as static.
// static variable
// A variable that is declared using static keyword is static variable. A single copy is created and shared among all the instances of the class. Memory allocation happens only once when the class is loaded in the memory

class TestClass {
    static int testStaticVariable = 100; // static variable
    private int testInstanceVariable;

    void testMethod() {
        int testLocalVariable = 10;
        System.out.println("Test Local Variable: " + testLocalVariable);
    }

    public int getTestInstanceVariable() {
        return this.testInstanceVariable;
    }

    public void setTestInstanceVariable(int testInstanceVariable) {
        this.testInstanceVariable = testInstanceVariable;
    }
}

public class SampleClass {
    public static void main(String[] args) {
        TestClass testclass = new TestClass();
        testclass.testMethod();
        testclass.setTestInstanceVariable(10);
        System.out.println("Instance Variable: " +
                testclass.getTestInstanceVariable());
        System.out.println("Static Variable: " +
                TestClass.testStaticVariable);
    };
};