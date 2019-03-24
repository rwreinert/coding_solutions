/**
 *  NOTE: Doesnt work for large numbers that require scientific notation!
 *  Wold need to convert E to
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        if(l1 == null || l2 == null)
            return null;

        // Algorithm:
        // Convert List to integer, add ints, then convert back to list

        ListNode curr = l1;
        ListNode ans = null;
        ListNode tempNode;

        char[] charArray;

        int exponent = 0;
        Double num1 = 0.0;
        Double num2 = 0.0;
        Double sum = 0.0;
        double temp;

        // Loop thru the list 1
        while(curr != null) {
            temp = (curr.val * Math.pow(10,exponent));
            num1 += temp;
            exponent++;
            curr = curr.next;
        }

        System.out.println(num1);

        // Loop thru the list 2
        curr = l2;
        exponent = 0;
        while(curr != null) {
            temp = (curr.val * Math.pow(10,exponent));
            num2 += temp;
            exponent++;
            curr = curr.next;
        }

        System.out.println(num2);

        //Add two nums:
        sum = num1+num2;

        //Convert sum back to list
        curr = null;

        charArray = sum.toString().toCharArray();
        if()

            // For each loop thru num, convert to list
            for(int i = charArray.length-1; i >= 0; i--) {
                if(ans == null) {
                    ans = new ListNode(Integer.parseInt(Character.toString(charArray[i])));
                    curr = ans;
                } else {
                    tempNode = new ListNode(Integer.parseInt(Character.toString(charArray[i])));
                    curr.next = tempNode;
                    curr = curr.next;
                }

            }

        return ans;
    }
}