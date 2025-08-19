// TaskManager.java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskManager {
    private List<Book> books;

    public TaskManager(List<Book> books) {
        this.books = books;
    }


    public int getTotalBooksByAuthor(String authorName) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                count++;
            }
        }
        return count;
    }


    public Set<String> getAllAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }


    public List<String> getBookNamesByAuthor(String authorName) {
        List<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                bookNames.add(book.getName());
            }
        }
        return bookNames;
    }


    public List<Book> getBooksByUserRating(double rating) {
        List<Book> booksWithRating = new ArrayList<>();
        for (Book book : books) {
            if (book.getUserRating() == rating) {
                booksWithRating.add(book);
            }
        }
        return booksWithRating;
    }


    public void printPriceOfBooksByAuthor(String authorName) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                System.out.println("Book: " + book.getName() + ", Price: $" + book.getPrice());
            }
        }
    }
}