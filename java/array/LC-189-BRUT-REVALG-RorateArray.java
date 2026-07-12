class Solution {
    private void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        // int[] nums2 = new int[nums.length];
        // k %= nums.length;

        // for(int i=0;i<nums.length;i++){
        //     nums2[i]=nums[(i - k + nums.length) % nums.length];
        // }
        // System.arraycopy(nums2, 0, nums, 0, nums.length);
        
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}
