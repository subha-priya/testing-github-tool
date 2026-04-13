package auto_scripts;

public class AddNumbers {
    // Existing method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to reverse a string (added by automation)
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to check if a string is a palindrome (added by automation)
    public boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }
}
