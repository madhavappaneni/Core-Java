package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("c", "test3@test.com"));
        customers.add(new Customer("a", "test2@test.com"));
        customers.add(new Customer("b", "test1@test.com"));
        Collections.sort(customers);
        System.out.println(customers);

        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}
