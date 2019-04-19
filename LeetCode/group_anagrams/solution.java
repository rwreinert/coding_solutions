/**
 * Given an array of words, group anagrams together.
 *
 * Runtime: 8 ms, faster than 99.25% of Java online submissions for Group Anagrams.
 * Memory Usage: 46.8 MB, less than 11.64% of Java online submissions for Group Anagrams.
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0)
            return new ArrayList();

        // Create hashmap holding str of sorted letters and list of words comprised of those letters
        // Sort each word from arg and check for equality
        // Add to hashmap
        // Create list of list from hashmap and return

        //List<List<String>> ans = new ArrayList<ArrayList<String>>();
        HashMap<String, List> map = new HashMap<>();

        // Loop once thru arg array
        for(int i = 0; i < strs.length; i++) {
            // Sort each word
            char[] tempArr = strs[i].toCharArray();
            Arrays.sort(tempArr);
            String tempStr = new String(tempArr);

            // if matches existing letter set, add word to map:
            if(map.containsKey(tempStr)) {
                map.get(tempStr).add(strs[i]);
            } else {
                // Add new entry letter set
                ArrayList<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                map.put(tempStr, arr);
            }
        }
        return new ArrayList(map.values());
    }
}