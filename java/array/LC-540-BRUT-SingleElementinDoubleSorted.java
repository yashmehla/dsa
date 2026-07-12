class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        if(nums.length==1){
                return nums[0];
            }
        if(nums[nums.length -1]!=nums[nums.length - 2]){
            return nums[nums.length-1];
        }
        for(int i=1;i<nums.length;i+=2){

            if(nums[i-1]!=nums[i]){
            res=nums[i-1];
            break;
           }
        }
        return res;
    }
}
