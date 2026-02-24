import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC6: Stack (LIFO) vs Queue (FIFO) Method ---");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        // Key Concept: Stack (Last In First Out)
        Stack<Character> stack = new Stack<>();
        // Key Concept: Queue (First In First Out)
        Queue<Character> queue = new LinkedList<>();

        // Enqueue and Push operations
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);   // Stack stores it
            queue.add(c);    // Queue stores it
        }

        boolean isPalindrome = true;

        // Logical Comparison: Compare FIFO output vs LIFO output
        while (!stack.isEmpty()) {
            // Pop gives the characters in REVERSE order
            // Dequeue (poll) gives the characters in ORIGINAL order
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a Palindrome.");
        }

        scanner.close();
    }
}