
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return ""; // Return an empty string if s is null or empty

        int start = 0, end = 0; // Initialize start and end indices of the longest palindrome
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
            int len = Math.max(len1, len2); // Take the maximum length of len1 and len2
            if (len > end - start) {
                start = i - (len - 1) / 2; // Update start index of the longest palindrome
                end = i + len / 2; // Update end index of the longest palindrome
            }
        }
        return s.substring(start, end + 1); // Return the longest palindromic substring
    }

    private int expandAroundCenter(String s, int left, int right) {
        // Expand around the center and check if characters are equal
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; // Move left index to the left
            right++; // Move right index to the right
        }
        return right - left - 1; // Return the length of the palindromic substring
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of the Solution class
        String s = "babad";
        System.out.println("Longest Palindromic Substring of 'babad': " + solution.longestPalindrome(s)); // Output: "bab" or "aba"

        s = "cbbd";
        System.out.println("Longest Palindromic Substring of 'cbbd': " + solution.longestPalindrome(s)); // Output: "bb"
    }
}
