package com.readcsv.model;

/**
 * Book model. Represents information about a book.
 */
public class Book {
    private final String title;
    private final String author;
    private final double avgRating;
    private final int ratingsCount;
    private final int publishedYear;
    private final String category;
    private final String url;

    public Book(String title, String author, double avgRating, int ratingsCount, int publishedYear, String category, String url) {
        this.title = title;
        this.author = author;
        this.avgRating = avgRating;
        this.ratingsCount = ratingsCount;
        this.publishedYear = publishedYear;
        this.category = category;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getCategory() {
        return category;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", avgRating=" + avgRating +
                ", ratingsCount=" + ratingsCount +
                ", publishedYear=" + publishedYear +
                ", category='" + category + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
