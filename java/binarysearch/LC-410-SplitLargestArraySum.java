class Solution {
    public int splitArray(int[] nums, int k) {
        if(nums.length<k) return -1;
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for(int i = 0 ; i<nums.length; i++){
            sum+=nums[i];
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        int left = max;
        int right = sum;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(ispossible(nums, mid, k)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    boolean ispossible(int[] array, int maximum , int parts){
        int count = 1;
        int currentSum = 0;
        for(int num : array){
            if(currentSum + num <= maximum){
                currentSum += num;
            }
            else{
                count ++;
                currentSum = num;
            }
        }
        if(count<=parts){
            return true;
        }
        else{
            return false;
        }
    }
}
