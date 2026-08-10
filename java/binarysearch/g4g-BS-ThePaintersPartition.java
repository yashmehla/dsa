class Solution {
    public int minTime(int[] arr, int k) {
        int max = arr[0];
        int sum = arr[0];
        for(int i = 0; i<arr.length; i++){
            sum+= arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int left  = max;
        int right = sum;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(canitbepainted(arr, mid, k)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    boolean canitbepainted(int[] array, int maximum, int painters){
        int currCount = 1;
        int currentSum = 0;
        for(int length : array){
            if(currentSum + length <= maximum){
                currentSum += length;
            }
            else{
                currCount++;
                currentSum = length;
            }
        }
        return (currCount<=painters);
    }
}
