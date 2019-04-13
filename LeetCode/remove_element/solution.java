/**
 *  Remove the val from the arg array in place and return the new length of the array.
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
 * Memory Usage: 37.4 MB, less than 94.58% of Java online submissions for Remove Element.
 */


class Solution {
    public int removeElement(int[] nums, int val) {

        int sp = 0;
        for(int fp = 0; fp<nums.length; fp++) {

            // If the index is not val, put in front of arr
            if(nums[fp] != val) {
                // Swap with next
                nums[sp] = nums[fp];
                sp++;
            }
        }
        return sp;
    }
}