public class Main {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();
        String test = "Was it a car or a cat I saw";

        System.out.println("Testing OOP Service:");
        System.out.println("Input: " + test);
        System.out.println("Result: " + (service.isPalindrome(test) ? "Palindrome" : "Not Palindrome"));
    }
}