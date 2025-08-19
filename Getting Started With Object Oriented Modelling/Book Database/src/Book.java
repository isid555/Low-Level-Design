public class Book {
    private String name;
    private String author;
    private double userRating;
    private int reviews;
    private int price;
    private int year;
    private String genre;


    public Book(String name, String author, double userRating, int reviews, int price, int year, String genre) {
        this.name = name;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getUserRating() {
        return userRating;
    }


    public int getPrice() {
        return price;
    }
}