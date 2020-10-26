package AdvancedJava.Exceptons.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    List<Book> archive = new ArrayList<>();

    public void addBook (Book book){
        archive.add(book);
    }
    public void removeBook (String isbn)throws BookRepositoryExceptions{
        for (Book book : archive){
            if (book.getIsbn().equals(isbn)) {
                archive.remove(book);
                return;
            }
        }
        throw new BookRepositoryExceptions("Can't delete book with this ISBN: " + isbn);
    }

    public Book findBookByName (String title) throws BookRepositoryExceptions{
        for (Book book : archive){
            if (book.getTitle().equals(title))
                return book;

        }
        throw new BookRepositoryExceptions("Cant find a book with this title: " + title);
    }

    public Book findBookByIsbn (String isbn) throws BookRepositoryExceptions{
        for (Book book : archive){
            if (book.getIsbn().equals(isbn))
                return book;
        }
        throw new BookRepositoryExceptions("Cant find book with this ISBN: " + isbn);
    }

}
