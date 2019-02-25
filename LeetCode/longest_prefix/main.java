/*
Requirements:

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

 */


class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min = Integer.MAX_VALUE; //Initial mininum word length
        int minIndex;
        String common = "";
        boolean done = false; // Simple boolean to exit while loop
        // Find the min length word in the array.
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
                minIndex = i;
            }
        }

        common = new String(strs[minIndex]);

        while (done != true) {
            done = true;
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(common)) {
                    common = common.substring(0, common.length() - 1);
                    done = false;
                    break;
                }
            }
        }
        return common;
    }
}