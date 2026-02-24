import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word (LinkedList Version): ");
        String word = scanner.nextLine().toLowerCase();

        LinkedList<Character> list = new LinkedList<>();
        for (char c : word.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        scanner.close();
    }
}