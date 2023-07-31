package GenericsDemo;

public class UserListClass {
    private User[] items = new User[10];
    private int count;

    public void add(User item) {
        items[count++] = item;
    }

    // public User get(User index) {
    // return items[index];
    // }
}
