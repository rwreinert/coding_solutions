/**
 * Find the longest palindrome substring of a string.
 *
 * Runtime: 5 ms, faster than 98.84% of Java online submissions for Longest Palindromic Substring.
 * Memory Usage: 37.3 MB, less than 94.00% of Java online submissions for Longest Palindromic Substring.
 */


class Solution {

    //Class variables
    int start = 0, end = 0;

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0)
            return "";

        // Start from 0 index a d loop thru string s
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);
            expand(s, i, i + 1); //Accounts for 2 digit paldm
        }

        return s.substring(start, end);
    }


    /**
     * Find the max palindrome starting at an index and expanding outward.
     * // Keep track of the length and store the max palindrome indecies
     */
    public void expand(String s, int left, int right) {

        int L = left, R = right;

        // loop
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            // Expand out
            L--;
            R++;
        }

        if ((R - L - 1) > (end - start)) {
            end = R;
            start = L + 1;
        }
    }
}