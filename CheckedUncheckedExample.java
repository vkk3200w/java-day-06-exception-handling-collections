import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedExample {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("sample.txt");
            reader.close();
        } catch (IOException e) {
            System.out.println("Checked exception handled");
        }

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception handled");
        }
    }
}