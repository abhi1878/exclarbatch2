public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0 itself) cannot be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Add the digit to reversed
            x /= 10;  // Remove the last digit
        }

        // Compare the original number with the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        int x1 = 121;
        System.out.println("Is " + x1 + " a palindrome? " + isPalindrome(x1));

        int x2 = -121;
        System.out.println("Is " + x2 + " a palindrome? " + isPalindrome(x2));

        int x3 = 10;
        System.out.println("Is " + x3 + " a palindrome? " + isPalindrome(x3));
    }
}