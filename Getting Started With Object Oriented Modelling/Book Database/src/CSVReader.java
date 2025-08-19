import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CSVReader extends Reader {

    @Override
    public List<Book> readBooks(String filePath) {
        List<Book> books = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.readLine();
            while ((line = br.readLine()) != null) {
                try {
                    String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                    if (fields.length == 7) {
                        String name = fields[0].replace("\"", "");
                        String author = fields[1].replace("\"", "");
                        double userRating = Double.parseDouble(fields[2]);
                        int reviews = Integer.parseInt(fields[3]);
                        int price = Integer.parseInt(fields[4]);
                        int year = Integer.parseInt(fields[5]);
                        String genre = fields[6];

                        Book book = new Book(name, author, userRating, reviews, price, year, genre);
                        books.add(book);
                    } else {
                        System.err.println("Skipping malformed line: " + line);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Skipping line due to invalid number format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}