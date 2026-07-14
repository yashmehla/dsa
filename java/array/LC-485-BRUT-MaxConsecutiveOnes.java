class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int consecutives = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                if(count>consecutives){
                    consecutives = count;
                    count = 0;
                }
                else if(count<=consecutives){
                    count = 0;
                }
            }
        }
        if(consecutives>count){
            return consecutives;
        }
        else{
            return count;
        }
        
    }
}
