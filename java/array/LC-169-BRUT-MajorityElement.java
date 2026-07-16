class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // If no candidate exists, choose the current element
            if (count == 0) {
                candidate = num;
            }

            // Increase confidence if same, otherwise decrease
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
