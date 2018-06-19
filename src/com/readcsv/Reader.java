package com.readcsv;

import com.readcsv.model.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reader class is responsible to read a given CSV file, parse it and generate a list of Books.
 */
public class Reader {
    private final String csvFilePath;   // path to the CSV file.
    private List<Book> books;       // An array of books.

    // Initialize the class with the CSV file.
    public Reader(String csvFilePath) {
        this.csvFilePath = csvFilePath;
        books = new ArrayList<>();
    }

    // Read the contents of CSV file and generate a list of books each of whom is represented by the 'Book' model.
    public void readAndParseCsv() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
        String line;

        while ((line = br.readLine()) != null) {
            String[] bookDetails = line.split(",");

            // Assigning the values to independent variables for clarity.
            String title = bookDetails[0];
            String author = bookDetails[1];
            double avgRating = Double.parseDouble(bookDetails[2]);
            int ratingsCount = Integer.parseInt(bookDetails[3]);
            int publishedYear = Integer.parseInt(bookDetails[4]);
            String category = bookDetails[5];
            String url = bookDetails[6];

            // Generate a book model.
            Book book = new Book(title, author, avgRating, ratingsCount, publishedYear, category, url);

            books.add(book);
        }

        br.close();
    }

    public void addToDatabase() {

        // Open a connection to the Data Source using the appropriate JDBC client library.

        for (Book book : books) {
            System.out.println(String.format("Inserting %s to the database ...", book.getTitle()));

            // execute the insert query here.
            // Todo: Exercise to the reader

            System.out.println("Done.");
        }

        // Close the connection to the database here.
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nBooks:\n=====\n");
        int count = 1;
        for (Book book : books) {
            String msg = String.format(
                    "%d. '%s' written by '%s', published in '%d' with an average rating of '%f' is listed as part of the '%s' category.\n",
                    count++,
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublishedYear(),
                    book.getAvgRating(),
                    book.getCategory()
            );
            sb.append(msg);
        }
        return sb.toString();
    }
}
