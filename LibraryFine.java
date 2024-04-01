import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days late: ");
        int delay = scanner.nextInt();

        if (delay <= 7) {
            System.out.println("Fine: 50 paise ");
        }
        else if (delay >= 8 && delay <= 14) {
            System.out.println("Fine: Rs. 1/-");
        }
        else if (delay > 14 && delay <= 21) {
            System.out.println("Fine: Rs. 5/-");
        }
        else {
            System.out.println("Your membership is canceled.");
        }
    }
}
