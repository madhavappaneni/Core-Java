package DemoCollections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Customer> map = new HashMap<>();
        var c1 = new Customer("Testname", "TestEmail");
        var c2 = new Customer("Testname2", "TestEmail2");

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        System.out.println(map.get("TestEmail"));

        System.out.println(map.getOrDefault("TestEmail10", new Customer("Unknown", "Unknown")));

        map.replace("Testname", new Customer("a++", "testemail2"));
        System.out.println(map);

        // Map is not iterable
        // map.keySet() is iterable through key
        // map.entrySet() is iteratble through entry
        // values() -- values

        System.out.println("_______");

        for (var key : map.keySet())
            System.out.println(key + " = " + map.get(key));

        System.out.println("_______");

        for (var entry : map.entrySet())
            System.out.println(entry);

        System.out.println("_______");

        for (var customer : map.values()) {
            System.out.println(customer);
        }
    }

}
