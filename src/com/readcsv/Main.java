package com.readcsv;

import com.readcsv.Reader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	    Reader csvReader = new Reader("data/books.csv");
        try {
            csvReader.readAndParseCsv();
        } catch (IOException e) {
            System.err.println("Failed to read the CSV file.");
            e.printStackTrace();
        }
        // csvReader.addToDatabase();
        System.out.println(csvReader);
    }
}
