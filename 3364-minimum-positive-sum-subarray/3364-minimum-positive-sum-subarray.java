class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {
            int val = calculate(nums, k);

            if (val > 0) {
                ans = Math.min(ans, val);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    int calculate(List<Integer> nums, int k) {
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            sum += nums.get(i);
        }

        if (sum > 0) {
            min = sum;
        }
        int z = 0;
        for (int j = k; j < nums.size(); j++) {
            sum += nums.get(j);
            sum -= nums.get(z);
            z++;
            if (sum > 0) {
                min = Math.min(min, sum);
            }
        }
        return min;
    }
}