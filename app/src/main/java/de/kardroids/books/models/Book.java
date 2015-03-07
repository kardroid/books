package de.kardroids.books.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by kk on 02.03.15.
 *
 * 
 */
public class Book implements Parcelable {

    private Integer id;

    private String title;

    private String shortDescription;

    private String longDescription;

    private String authors;

    private String translator;

    private String publisher;

    private Date releaseDate;

    private String isbn10;

    private String isbn13;

    private Integer numberSites;

    private String coverImagePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public Integer getNumberSites() {
        return numberSites;
    }

    public void setNumberSites(Integer numberSites) {
        this.numberSites = numberSites;
    }

    public String getCoverImagePath() {
        return coverImagePath;
    }

    public void setCoverImagePath(String coverImagePath) {
        this.coverImagePath = coverImagePath;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }


    // For Parcel - (Intent,Bundle)


    public static final Parcelable.Creator<Book> CREATOR =
            new Parcelable.Creator<Book>(){

                @Override
                public Book createFromParcel(Parcel source) {
                    return new Book(source);
                }

                @Override
                public Book[] newArray(int size) {
                    return new Book[size];
                }
            };

    public Book (Parcel source) {
        readFromParcel(source);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(shortDescription);
        dest.writeString(longDescription);
        dest.writeString(authors);
        dest.writeString(translator);
        dest.writeString(publisher);
        // hope this works
        dest.writeLong(releaseDate.getTime());
        dest.writeString(isbn10);
        dest.writeString(isbn13);

        dest.writeInt(numberSites);
        dest.writeString(coverImagePath);
    }

    public void readFromParcel(Parcel source){
        this.id = source.readInt();
        this.title = source.readString();
        this.shortDescription = source.readString();
        this.longDescription = source.readString();
        this.authors = source.readString();
        this.translator = source.readString();
        this.publisher = source.readString();
        // hope this works
        this.releaseDate =new Date(source.readLong());
        this.isbn10 =source.readString();
        this.isbn13 =source.readString();

        this.id =source.readInt();
        this.coverImagePath =source.readString();
    }
}

