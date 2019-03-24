class Solution {
    public int[] twoSum(int[] nums, int target) {
        // One pass hashtable approach

        Map<Integer, Integer> map = new HashMap<>();

        //Iterate thru the nums array
        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            //if the map already contains the complement adding up to target, return it!
            if(map.containsKey(comp)) {
                return new int[] {
                        map.get(comp), i
                };
            }
            //Add to map
            map.put(nums[i],i);
        }
        //No solution!
        return null;
    }
}