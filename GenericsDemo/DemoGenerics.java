package GenericsDemo;

import DemoCollections.GenericList;

public class DemoGenerics {

    public static void main(String[] args) {
        // With a datatype specific list, lot of code duplication happens, so need
        // primitives
        // var list = new ListClassObject();
        // list.add(1);
        // list.add("1");
        // list.add(new User());

        // System.out.println(list.get(0));
        // // Objects are returned on get. not a good option. need to add manual type
        // castings to all types of elements.
        // // Runtime bugs.

        // var list = new GenericList<Integer>();
        // list.add(1);

        // // Can achieve compile time type safety using generics
        // var userList = new GenericList<User>();
        // userList.add(new User());

        // GenericList<Integer> numbers = new GenericList();
        // // new GenericList<Integer>(); isn't necessary, can use new GenericList<>();
        // numbers.add(1);
        // int number = numbers.get(0);
        // System.out.println(number);

        // var user1 = new User(10);
        // var user2 = new User(20);

        // if (user1.compareTo(user2) < 0) {
        // System.out.println("User1 < User2");
        // } else if (user1.compareTo(user2) > 0) {
        // System.out.println("User1 > User2");
        // } else {
        // System.out.println("User1 == User2");
        // }

        // System.out.println(Utils.max(user1, user2));
        // System.out.println(Utils.max(1, 2));

        // Utils.print(10, 10.0);

        User user = new Instructor(10);
        System.out.println(user);
        Utils.printUser(new Instructor(10));

        var users = new GenericList<User>();
        var instructors = new GenericList<Instructor>();
        // Utils.printUsers(users);
    }
}