package de.kardroids.books;

import com.orm.SugarApp;

import de.kardroids.books.db.DatabaseHelper;
import de.kardroids.books.db.DatabaseHelperImpl;

/**
 * Created by Dagobert on 10.03.2015.
 */
public class BooksApplication extends SugarApp {

    private DatabaseHelper databaseHelper;

    public BooksApplication() {
        databaseHelper = new DatabaseHelperImpl();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ((DatabaseHelperImpl) databaseHelper).createTestData();
    }

    public DatabaseHelper getDatabaseHelper() {
        return databaseHelper;
    }
}
