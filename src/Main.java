public class Main {
    public static boolean isPalindrome(String word) {
        // Regex: \\s+ matches one or more spaces
        String clean = word.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Nurses Run";
        System.out.println("Checking phrase: " + input);
        System.out.println(isPalindrome(input) ? "Result: Palindrome" : "Result: Not Palindrome");
    }
}