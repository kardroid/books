package de.kardroids.books.db;

import java.util.List;

import de.kardroids.books.models.Book;

/**
 * Created by Dagobert on 10.03.2015.
 */
public interface DatabaseHelper {
    void saveBook(Book... books);

    Book findBookById(long id);

    List<Book> findAllBooks();

    void deleteBook(long id);

    void deleteBook(Book book);
}
