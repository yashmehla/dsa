class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] numbers = {-1,-1};

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                numbers[0]=i;
                break;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==target){
                numbers[1]=j;
            }
        }
        return numbers;
    }
}
