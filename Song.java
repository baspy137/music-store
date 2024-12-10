public class Song {
    private String title;
    private Genre genre;
    private Author author;
    private double price;

    public Song(String title, Genre genre, Author author, double price) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " by " + author.getName() + " (" + genre.getName() + ") - $" + price;
    }
}
