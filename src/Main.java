public class UseCase13PalindromeCheckerApp {

    // Algorithm 1: Two-Pointer (Manual)
    public static boolean checkTwoPointer(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--)) return false;
        }
        return true;
    }

    // Algorithm 2: StringBuilder (Built-in)
    public static boolean checkStringBuilder(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    public static void main(String[] args) {
        String testWord = "amanaplanacanalpanama"; // 21 chars
        int iterations = 100000;

        System.out.println("--- UC13: Performance Comparison ---");
        System.out.println("Testing with: " + testWord);
        System.out.println("Iterations: " + iterations);
        System.out.println("------------------------------------");

        // Measure Two-Pointer
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            checkTwoPointer(testWord);
        }
        long durationTwoPointer = System.nanoTime() - startTime;
        System.out.println("Two-Pointer Method:   " + durationTwoPointer + " ns");

        // Measure StringBuilder
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            checkStringBuilder(testWord);
        }
        long durationStringBuilder = System.nanoTime() - startTime;
        System.out.println("StringBuilder Method: " + durationStringBuilder + " ns");

        // Result Analysis
        System.out.println("------------------------------------");
        if (durationTwoPointer < durationStringBuilder) {
            System.out.println("Winner: Two-Pointer Method is faster!");
        } else {
            System.out.println("Winner: StringBuilder Method is faster!");
        }
    }
}