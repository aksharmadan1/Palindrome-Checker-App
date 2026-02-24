import java.util.Stack;
import java.util.Scanner;

// 1. STRATEGY INTERFACE
interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

// 2. CONCRETE STRATEGY: STACK (LIFO)
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        for (char c : clean.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return clean.equals(reversed.toString());
    }
}

// 3. CONCRETE STRATEGY: TWO-POINTER (Optimized)
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("\\s+", "");
        int left = 0, right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

// 4. CONTEXT CLASS (Main App)
public class UseCase12PalindromeCheckerApp {
    private PalindromeStrategy strategy;

    // Method to change strategy at runtime (Polymorphism)
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeCheck(String text) {
        if (strategy == null) {
            System.out.println("No strategy set!");
            return false;
        }
        return strategy.isPalindrome(text);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UseCase12PalindromeCheckerApp app = new UseCase12PalindromeCheckerApp();

        System.out.println("=== UC12: STRATEGY PATTERN PALINDROME CHECKER ===");
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // RUNNING STRATEGY 1: STACK
        app.setStrategy(new StackStrategy());
        System.out.println("\n[Strategy: Stack (LIFO)]");
        System.out.println("Result: " + (app.executeCheck(input) ? "Palindrome" : "Not Palindrome"));

        // RUNNING STRATEGY 2: TWO-POINTER
        app.setStrategy(new TwoPointerStrategy());
        System.out.println("\n[Strategy: Two-Pointer (Optimized)]");
        System.out.println("Result: " + (app.executeCheck(input) ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}