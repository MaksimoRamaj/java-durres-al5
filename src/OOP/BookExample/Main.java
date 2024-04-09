package OOP.BookExample;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java","Herbert Schildt",2021);
        String authorName = book.getAuthor();
        System.out.println(authorName);

        book.setAuthor(null);
        book.setTitle("");
        book.setPublicationYear(-5);
    }
}
