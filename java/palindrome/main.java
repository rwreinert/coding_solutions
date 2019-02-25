/*
Requirements:

Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same backward as forward.
 */

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0)
            return false; //neg cant be a palindrome!

        String str = String.valueOf(x);
        char[] chr = str.toCharArray();

        int p1 = 0;
        int p2 = chr.length - 1;

        while (p1 != p2 && p1 < p2) {
            if (chr[p1] != chr[p2])
                return false;
            p1++;
            p2--;
        }
        return true;
    }
}