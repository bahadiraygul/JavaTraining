package book.repository;

import java.util.List;
import java.util.Objects;

enum Genre {
    ACTION, FANTASY, CRIME
}

public class Book implements Comparable<Book>{
    private String title;
    private double price;
    private int releaseYear;
    private List<String> authorList;
    private Genre genre;

    public Book(String title, double price, int releaseYear, List<String> authorList) {
        this.title = title;
        this.price = price;
        this.releaseYear = releaseYear;
        this.authorList = authorList;
    }

    public Book(String title, int price, int releaseYear, List<Author> list, Genre genre) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<String> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<String> authorList) {
        this.authorList = authorList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && releaseYear == book.releaseYear && Objects.equals(title, book.title) && Objects.equals(authorList, book.authorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, releaseYear, authorList);
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
