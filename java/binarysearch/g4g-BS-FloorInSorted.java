class Solution {
    static int findFloor(int[] arr, int x) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = right + (left-right) / 2;
            if(x>=arr[mid]){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        } 
        return right;
    }
}
