class Solution {
    int countFreq(int[] arr, int target) {
        int left1 = 0;
        int right1 = arr.length-1;
        while(left1<=right1){
            int mid = right1 + (left1 - right1) / 2;
            if(target<=arr[mid]){
                right1=mid-1;
            }
            else{
                left1=mid+1;
            }

        }
        int left2 = 0;
        int right2 = arr.length-1;
        while(left2<=right2){
            int mid = right2 + (left2 - right2) / 2;
            if(target>=arr[mid]){
                left2=mid+1;
            }
            else{
                right2=mid-1;
            }
        }
        return (right2-left1+1);
        
        
    }
}
