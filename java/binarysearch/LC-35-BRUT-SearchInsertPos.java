class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[0]>target){
                return 0;
            }
            else if(nums[nums.length-1]<target){
                return nums.length;
            }
            else{
                if(nums[i]<target && target<nums[i+1]){
                    return i+1;
                }
            }
        }return -1;
    } 
}
