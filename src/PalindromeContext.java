import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC4: Character Array & Two-Pointer Method ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Key Concept: Convert String to primitive char array
        char[] charArray = input.toLowerCase().toCharArray();

        // Key Concept: Two-Pointer Technique
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            // Compare characters at both ends
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Optimization: stop immediately if mismatch found
            }
            left++;  // Move front pointer forward
            right--; // Move back pointer backward
        }

        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a Palindrome.");
        }

        scanner.close();
    }
}