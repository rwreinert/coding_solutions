class Solution {
    public int lengthOfLastWord(String s) {
        
        String [] strArray = s.split(" ");
        
        if(strArray.length == 0)
            return 0;
        else        
            return strArray[strArray.length-1].length();
    }
}