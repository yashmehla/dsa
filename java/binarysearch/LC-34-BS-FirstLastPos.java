class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left1 = 0;
        int right1 = nums.length-1;
        while(left1<=right1){
            int mid = right1 + (left1 - right1) / 2;
            if(target<=nums[mid]){
                right1=mid-1;
            }
            else{
                left1=mid+1;
            }

        }
        int left2 = 0;
        int right2 = nums.length-1;
        while(left2<=right2){
            int mid = right2 + (left2 - right2) / 2;
            if(target>=nums[mid]){
                left2=mid+1;
            }
            else{
                right2=mid-1;
            }
        }
        int[] ans = new int[2];
        if(left1 < nums.length && nums[left1]==target){
            ans[0]=left1;
            ans[1]=right2;
            return ans;
        }
        else {
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        
    }
}
