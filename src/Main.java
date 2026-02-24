import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC5: Stack Data Structure Method ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Sanitize input (lowercase) to ensure accuracy
        String sanitized = input.toLowerCase();
        
        // Key Concept: Stack (LIFO - Last In First Out)
        Stack<Character> stack = new Stack<>();

        // Push Operation: Adding all characters to the stack
        for (int i = 0; i < sanitized.length(); i++) {
            stack.push(sanitized.charAt(i));
        }

        // Reversal Logic: Building a string by popping characters
        String reversed = "";
        while (!stack.isEmpty()) {
            // Pop Operation: Removes the top element (the last one added)
            reversed += stack.pop();
        }

        // Validate Palindrome
        if (sanitized.equals(reversed)) {
            System.out.println("Result: '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a Palindrome.");
        }

        scanner.close();
    }
}
