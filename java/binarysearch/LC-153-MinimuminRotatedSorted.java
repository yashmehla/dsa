class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int lowest = nums[0];
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[left]<=nums[mid]){
                lowest = Math.min(nums[left], lowest);
                left = mid + 1;
            }
            else{
                lowest = Math.min(nums[mid], lowest);
                right = mid -1;
            }
        }
        return lowest;
    }
}
