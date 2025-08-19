import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Reader reader = new CSVReader();
        String fileName = "S:\\$SCALER SCHOOL OF TECHNOLOGY\\Trimester 9\\Low Level Design\\Getting Started With Object Oriented Modelling\\Book Database\\data.csv";

        List<Book> books = reader.readBooks(fileName);

        if (!books.isEmpty()) {

            TaskManager taskManager = new TaskManager(books);


            String author1 = "Stephen King";
            int count = taskManager.getTotalBooksByAuthor(author1);
            System.out.println("Total books by " + author1 + ": " + count);
            System.out.println("----------------------------------------");


            Set<String> allAuthors = taskManager.getAllAuthors();
            System.out.println("All authors in the dataset:");
            allAuthors.forEach(System.out::println);
            System.out.println("----------------------------------------");


            String author2 = "Stephenie Meyer";
            List<String> booksByAuthor = taskManager.getBookNamesByAuthor(author2);
            System.out.println("Books by " + author2 + ":");
            booksByAuthor.forEach(System.out::println);
            System.out.println("----------------------------------------");


            double desiredRating = 4.8;
            List<Book> booksWithRating = taskManager.getBooksByUserRating(desiredRating);
            System.out.println("Books with a user rating of " + desiredRating + ":");
            booksWithRating.forEach(book -> System.out.println(book.getName() + " by " + book.getAuthor()));
            System.out.println("----------------------------------------");


            String author3 = "Suzanne Collins";
            System.out.println("Prices of books by " + author3 + ":");
            taskManager.printPriceOfBooksByAuthor(author3);
        } else {
            System.out.println("No books were read from the file. Please check if 'data.csv' exists and is correctly formatted.");
        }
    }
}