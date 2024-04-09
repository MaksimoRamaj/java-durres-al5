package OOP.BookExample;

/*
Create a Java class named Book that represents a book.
Encapsulate the attributes (title, author, and publication year) by making them private
and provide public getter and setter methods to access and modify these attributes.
 */

import java.util.Objects;

/*
Challenge: Add validation to the setter methods to ensure that the title and
 author are not empty strings, and the publication
 year is a valid positive year (e.g., not in the future).
 */
public class Book {

    private String title;
    private String author;
    private int publicationYear;

    public Book() {
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if ( title == null || title.isEmpty()){
            System.out.println("Author nuk mund te jete bosh ose null");
            return;
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if ( author == null || author.isEmpty()){
            System.out.println("Author nuk mund te jete bosh ose null");
            return;
        }
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        //te jete positive
        if (publicationYear < 0){
            System.out.println("Viti duhet te jete nje numer pozitiv!");
            return;
        }
        this.publicationYear = publicationYear;
    }
}
