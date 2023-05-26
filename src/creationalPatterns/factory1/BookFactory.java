package creationalPatterns.factory1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BookFactory {
    final static Map<String, Supplier<Book>> map = new HashMap<>();

    /**
     * Ассоциированный массив
     */
    static {
        map.put("scrapbook", Scrapbook::new);
        map.put("notepad", Notepad::new);
        map.put("copybook", Copybook::new);
        map.put("sketchbook", Sketchbook::new);
    }

    public static Book createBook(String name) {
        Supplier<Book> book = map.get(name);
        if (book != null) return book.get();
        throw new IllegalArgumentException("No such product " + name);
    }
}
