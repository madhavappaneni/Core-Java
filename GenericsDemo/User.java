package GenericsDemo;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // if (this.points < o.points) {
        // return -1;
        // }
        // if (this.points == o.points) {
        // return 0;
        // } else {
        // return 0;
        // }

        return this.points - other.points;
    }

    @Override
    public String toString() {
        return "Points=" + this.points;
    }

}
