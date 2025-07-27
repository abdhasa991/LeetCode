// FUnction to check if a string is a palindrome
class CheckPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int ReversedNumber = 0;
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            ReversedNumber = ReversedNumber * 10 + digit; // Append it to the reversed number
            n /= 10; // Remove the last digit from n
        }
        if (x == ReversedNumber) {
            return true;
        } else {
            return false;
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        boolean result = CheckPalindrome.isPalindrome(x);
        if (result) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
    }
}
