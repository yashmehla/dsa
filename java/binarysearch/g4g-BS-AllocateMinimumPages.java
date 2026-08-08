class Solution {
    public int findPages(int[] arr, int k) {
        if(arr.length<k) return -1;
        long min = arr[0];
        long max = arr[0];
        long sum = 0;
        for(int i = 0 ; i <arr.length; i++){
            sum+=arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        long left = max;
        long right = sum;
        while(left<=right){
            long mid = left + (right - left) / 2;
            if(canItHold(arr, mid, k)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return (int)left;
    }
    boolean canItHold(int[] array, long maximum, long students){
        int studentCount = 1;
        int currentPagesSum = 0;
        for(int pages : array){
            if(currentPagesSum+pages<=maximum){
                currentPagesSum+=pages;
            }
            else{
                studentCount++;
                currentPagesSum = pages;
            }
        }
        if(studentCount<=students){
            return true;
        }
        else{
            return false;
        }
    }
}
