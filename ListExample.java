import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> books = new ArrayList<>();

        books.add("Java");
        books.add("Python");
        books.add("SQL");
        books.add("Java");

        System.out.println("Books: " + books);

        System.out.println("First book: " + books.get(0));

        books.remove("Python");

        System.out.println("After removal: " + books);

        System.out.println("Number of books: " + books.size());

        for (String book : books) {
            System.out.println(book);
        }
    }
}