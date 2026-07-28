class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxelement = 0;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > maxelement) {
                maxelement = piles[i];
            }
        }
        int low = 1;
        int high = maxelement;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            long hours = totalHours(piles, mid);

            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public long totalHours(int[] arr, int hourly) {
        long total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += (arr[i] + (long) hourly - 1) / hourly;
        }

        return total;
    }
}
