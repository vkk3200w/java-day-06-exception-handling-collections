public class TryCatchExample {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 0;

        try {
            int result = number1 / number2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues");
    }
}