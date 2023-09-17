package CollectionsDemo;

public class DemoGenericList {

    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        var iterator = list.iterator();

        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }

        for (var item : list) {
            System.out.println(item);
        }
    }
}
