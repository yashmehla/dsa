class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        int[] count = new int[n];
        for (int[] inv : invocations) count[inv[0]]++;

        int[] start = new int[n];
        for (int i = 1; i < n; i++) start[i] = start[i-1] + count[i-1];

        int[] temp = new int[invocations.length];
        int[] idx = start.clone();
        for (int[] inv : invocations) temp[idx[inv[0]]++] = inv[1];

        boolean[] suspicious = new boolean[n];
        suspicious[k] = true;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(k);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int i = start[node]; i < start[node] + count[node]; i++)
                if (!suspicious[temp[i]]) { suspicious[temp[i]] = true; queue.offer(temp[i]); }
        }

        for (int[] inv : invocations)
            if (!suspicious[inv[0]] && suspicious[inv[1]]) {
                List<Integer> result = new ArrayList<>();
                for (int i = 0; i < n; i++) result.add(i);
                return result;
            }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) if (!suspicious[i]) result.add(i);
        return result;
    }
}
