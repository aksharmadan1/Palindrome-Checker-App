import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Deque Palindrome Checker ---");
        System.out.print("Enter word: ");
        String word = scanner.nextLine().toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        // Compare front and back until 1 or 0 elements remain
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Result: Palindrome" : "Result: Not Palindrome");
        scanner.close();
    }
}