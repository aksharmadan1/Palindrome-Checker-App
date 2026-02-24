public class SimpleReverseStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String word) {
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}