class Solution{
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        int low = 1;
        int high = max - min;
        while(low<=high){
            int mid = low + (high - low ) / 2;
            if(canweplace(arr, mid, k)){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return high;
    }
    boolean canweplace(int[] array, int mindistance, int cows){
        int countcows = 1;
        int lastcow = array[0];
        for(int i = 1; i< array.length; i++){
            if((array[i]-lastcow) >= mindistance){
                lastcow = array[i];
                countcows++;
            }
        }
        if(countcows>=cows){
            return true;
        }
        else{
            return false;
        }
    }
}
