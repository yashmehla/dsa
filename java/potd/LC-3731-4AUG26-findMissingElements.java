class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i];
            int next = nums[i + 1];

            for(int j = curr + 1; j < next; j++) {
                ans.add(j);
            }
        }

        return ans;
    }
}
//Alternate better solution: Using hashmap reduces one loop complexity. Finding min and max. putting the elements in the new List that only contains elements that were missing.
