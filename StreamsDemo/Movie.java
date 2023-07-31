package StreamsDemo;

public class Movie {
    private String title;
    private int likes;
    private Genre genre;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "{" +
                " title='" + getTitle() + "'" +
                ", likes='" + getLikes() + "'" +
                ", genre='" + getGenre() + "'" +
                "}";
    }

}
