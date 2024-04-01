
import java.util.Scanner;

public class DivisibiltyChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 7 == 0 && number % 13 == 0) {
            System.out.println("The number is divisible by both 7 and 13.");

            int quotient7 = number / 7;
            int remainder7 = number % 7;

            int quotient13 = number / 13;
            int remainder13 = number % 13;

            System.out.println("When divided by 7, quotient is " + quotient7 + " and remainder is " + remainder7);
            System.out.println("When divided by 13, quotient is " + quotient13 + " and remainder is " + remainder13);
        } else {
            System.out.println("The number is not divisible by both 7 and 13.");
        }

        scanner.close();
    }
}
