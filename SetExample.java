import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> books = new HashSet<>();

        books.add("Java");
        books.add("Python");
        books.add("SQL");
        books.add("Java");

        System.out.println("Books: " + books);

        System.out.println("Contains Java: " + books.contains("Java"));

        books.remove("Python");

        System.out.println("After removal: " + books);

        System.out.println("Number of books: " + books.size());

        for (String book : books) {
            System.out.println(book);
        }
    }
}