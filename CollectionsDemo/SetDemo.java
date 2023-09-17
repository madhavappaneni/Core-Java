package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "a");
        Set<String> set2 = new HashSet<>(collection);
        System.out.println(set2);

        Set<String> set3 = new HashSet<>(Arrays.asList("a", "b", "c"));
        System.out.println(set3);

        Set<String> set4 = new HashSet<>(Arrays.asList("b", "c", "d"));
        System.out.println(set4);

        // // Union
        // set3.addAll(set4);
        // System.out.println(set3);

        // // Intersection
        // set3.retainAll(set4);
        // System.out.println(set3);

        // Difference
        set3.removeAll(set4);
        System.out.println(set3);

    }

}
