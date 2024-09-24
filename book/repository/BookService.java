package book.repository;

import java.util.*;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public void add(Book book){
        books.add(book);
    }

    public void remove(Book book){
        books.remove(book);
    }

    public List<Book> getAll(){
        return books;
    }

    public List<Book> findByGenre(Genre genre){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getGenre() == genre){
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findByReleaseYear(int year){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getReleaseYear() == year){
                result.add(book);
            }
        }
        return result;
    }

    public Book findMostExpensiveBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrice() <
                    book.getPrice()) {
                result = book;
            }
        }
        return result;
    }

    public Book findMostCheapestBook(){
        Book result = null;
        for(Book book : books){
            if(result == null || result.getPrice() >
            book.getPrice()){
                result = book;
            }
        }
        return result;
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors){
        List<Book> results = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthorList().size() == numberOfAuthors){
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> sortByTitleAsc(){
        Collections.sort(books);
        return  books;
    }

    public List<Book> sortByTitleDsc() {
        Collections.reverse(books);
        return books;
    }

    public boolean isBookInRepo(Book book){
        return books.contains(book);
    }

    public List<Book> findByAuthor(Author author){
        List<Book> results = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthorList().contains(author)){
                results.add(book);
            }
        }
        return  results;
    }

    public Map<Genre, String> mapBooks() {
        Map<Genre, String> booksMap = new HashMap<>();
        for (Book book : books) {
            booksMap.put(book.getGenre(), book.getTitle());
        }
        return booksMap;
    }

    public Stack<Book> createBookStack() {
        // Kitapları fiyatlarına göre sıralar (artış sırasına göre)
        Collections.sort(books, Comparator.comparingDouble(Book::getPrice));

        // Kitapları saklayacak bir Stack oluşturulur
        Stack<Book> bookStack = new Stack<>();

        // Sıralanan kitaplar Stack'e eklenir
        for (Book book : books) {
            bookStack.push(book);
        }

        // Oluşturulan Stack geri döndürülür
        return bookStack;
    }

}


