import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        if (vowelCount > 0) {
            System.out.println("The string contains " + vowelCount + " vowel(s).");
        } else {
            System.out.println("The string does not contain any vowels.");
        }

        scanner.close();
    }
}
