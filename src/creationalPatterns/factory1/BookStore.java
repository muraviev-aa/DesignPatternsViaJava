package creationalPatterns.factory1;

public class BookStore {
    BookFactory factory;

    public BookStore(BookFactory factory) {
        this.factory = factory;
    }

    public Book orderBook(String type) {
        Book book;
        book = factory.createBook(type);
        book.action();
        return book;
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore(new BookFactory());
        bookStore.orderBook("scrapbook");
        bookStore.orderBook("notepad");
        bookStore.orderBook("copybook");
        bookStore.orderBook("sketchbook");
    }
}
