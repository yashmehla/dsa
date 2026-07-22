class Solution {
    static final int MOD = 1_000_000_007;

    public int minimumCost(int[] nums, int k) {
        long resources = k;
        long operations = 0;
        long cost = 0;

        for (int num : nums) {
            if (resources < num) {
                long need = (num - resources + k - 1L) / k;

                long a = need;
                long b = 2 * operations + need + 1;

                if ((a & 1) == 0) {
                    a /= 2;
                } else {
                    b /= 2;
                }

                cost = (cost + (a % MOD) * (b % MOD)) % MOD;

                operations += need;
                resources += need * (long) k;
            }
            resources -= num;
        }

        return (int) cost;
    }
}
