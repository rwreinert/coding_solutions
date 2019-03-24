class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> solutions = new ArrayList();
        List<Integer> temp;

        for(int p1 = 0; p1<=nums.length-3; p1++) {
            // p2 = p1+1;

            for(int p2 = p1+1; p2<=nums.length-2; p2++) {
                // p3=p2+1;

                for(int p3 = p2+1; p3<=nums.length-1; p3++) {

                    // if sum 0, add to solutions!
                    if(nums[p1]+nums[p2]+nums[p3] == 0) {
                        //check for duplicates
                        temp = new ArrayList<Integer>(Arrays.asList(nums[p1],nums[p2],nums[p3]));
                        Collections.sort(temp);

                        if(!solutions.contains(temp))
                            solutions.add(temp);

                    }
                }
            }
        }

        return solutions;
    }
}