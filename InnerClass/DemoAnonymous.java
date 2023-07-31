package InnerClass;

abstract class Person {
    abstract void eat();

}

interface Eatable {
    void eat();
}

// An anonymous class is an inner class without a name and for which only a
// single object is created. An anonymouse inner class can be useful when making
// an instance of an object with extras such as overloading methods of a class
// or interface without having to actually subclass a class.
// A class that has no name is known as an anonymous inner class in java. It
// should be useful if you have to override a method of class or interface.
// It can be created in two ways - Class - may be abstract or concrete &
// Interface
public class DemoAnonymous {

    public static void main(String[] args) {
        // Person p = new Person() {
        // void eat() {
        // System.out.println("Nice fruits");
        // }
        // };
        // p.eat();

        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("Nice fruits");
            }
        };
        e.eat();
    }
}
