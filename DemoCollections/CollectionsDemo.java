package DemoCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);

        Collections.addAll(collection, "a", "b", "c");

        for (var item : collection) {
            System.out.println(item);
        }
        collection.remove("a");
        System.out.println(collection);
        System.out.println(collection.contains("a"));
        System.out.println(collection.size());
        
        // var objectArray = collection.toArray();

        // var stringArray = collection.toArray(new String[0]);
    }
}
