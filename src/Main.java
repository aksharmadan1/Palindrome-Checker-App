public class Main {
    public static boolean isPalindrome(String word) {
        // Cleaning the string: remove spaces and lowercase
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String input = "Madam In Eden Im Adam";
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not Palindrome");
    }
}
