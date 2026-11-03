import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Learning Java Exception Handling");
            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("File operation failed");
        }
    }
}