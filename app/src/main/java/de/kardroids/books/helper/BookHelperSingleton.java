package de.kardroids.books.helper;

import java.util.List;

import de.kardroids.books.models.Book;

/**
 * Created by kk on 02.03.15.
 */
public class BookHelperSingleton {

    private static BookHelperSingleton instance = null;

    private List<Book> bookList;

    protected BookHelperSingleton() {
        // Exists only to defeat instantiation.
    }
    public static BookHelperSingleton getInstance() {
        if(instance == null) {
            instance = new BookHelperSingleton();
        }
        return instance;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Book findBookById(Integer id)
    {
        for(Book tempBook : this.bookList)
        {
            if(tempBook.getId() == id)
            {
                return tempBook;
            }
        }
        return null;
    }
}
