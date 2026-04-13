package auto_scripts;

public class AddNumbers {
    // Existing method to add numbers (preserved)
    public int add(int a, int b) {
        return a + b;
    }

    // Method to reverse a string
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }
}
