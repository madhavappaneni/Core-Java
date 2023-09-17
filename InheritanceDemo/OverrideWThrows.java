import java.sql.SQLException;

class SuperClass {
    void methodOfSuperClass() {
        System.out.println("Super class method is not throwing any excpetions");
    }
}

class SubClass extends SuperClass {
    @Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException {
        System.out.println("Can be overriden with any unchecked exception");
    }
}

class SubClassOne extends SuperClass {
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException {
        System.out.println("Can be overriden with any number of unchecked exception");
    }
}

class SubClassTwo extends SuperClass {
    // @Override
    // void methodOfSuperClass() throws SQLException {
    // Compile time weeoe.
    // Exception is not compatible with the throws clause in
    // superclass.methodofsuperclass()
    // }
}

public class OverrideWThrows {

}
