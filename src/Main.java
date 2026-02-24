public class Main {
    public static boolean isPalindrome(String word) {
        // Base Case: If length is 0 or 1, it's a palindrome
        if (word.length() <= 1) {
            return true;
        }

        // Check if first and last characters match
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        // Recursive Step: Check the middle substring
        return isPalindrome(word.substring(1, word.length() - 1));
    }

    public static void main(String[] args) {
        String input = "racecar";
        System.out.println("--- Recursive Palindrome Checker ---");
        System.out.println("Word: " + input);

        if (isPalindrome(input.toLowerCase())) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not Palindrome");
        }
    }
}