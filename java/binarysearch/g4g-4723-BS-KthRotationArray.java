class Solution {
    public int findKRotation(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int lowest = arr[0];
        int lowestIndex = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[left] <= arr[mid]) {
                if (arr[left] < lowest) {
                    lowest = arr[left];
                    lowestIndex = left;
                }
                left = mid + 1;
            } 
            else {
                if (arr[mid] < lowest) {
                    lowest = arr[mid];
                    lowestIndex = mid;
                }
                right = mid - 1;
            }
        }
        return lowestIndex;
    }
}
