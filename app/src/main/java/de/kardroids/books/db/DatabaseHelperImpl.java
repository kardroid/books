package de.kardroids.books.db;

import java.util.List;

import de.kardroids.books.models.Book;

/**
 * Created by Dagobert on 10.03.2015.
 */
public class DatabaseHelperImpl implements DatabaseHelper {
    private static final String TAG = DatabaseHelperImpl.class.getSimpleName();

    @Override
    public void saveBook(Book... books) {
        for (Book book : books) {
            book.save();
        }
    }

    @Override
    public Book findBookById(long id) {
        return Book.findById(Book.class, id);
    }

    @Override
    public List<Book> findAllBooks() {
        return Book.listAll(Book.class);
    }

    @Override
    public void deleteBook(long id) {
        findBookById(id).delete();
    }

    @Override
    public void deleteBook(Book book) {
        book.delete();
    }

    public void createTestData() {
        Book tempBook1 = new Book();
        tempBook1.setTitle("Darm mit Charme: Alles über ein unterschätztes Organ");
        tempBook1.setAuthors("Giulia Enders");
        tempBook1.setPublisher("Ullstein Hardcover");
        tempBook1.setIsbn10("3550080417");
        tempBook1.setIsbn13("978-3550080418");

        saveBook(tempBook1);

        Book tempBook2 = new Book();
        tempBook2.setTitle("Fit ohne Geräte: Trainieren Mit Dem Eigenen Körpergewicht");
        tempBook2.setAuthors("Mark Lauren");
        tempBook2.setPublisher("riva");
        tempBook2.setIsbn10("3868831665");
        tempBook2.setIsbn13("978-3868831665");

        saveBook(tempBook2);
    }
}
