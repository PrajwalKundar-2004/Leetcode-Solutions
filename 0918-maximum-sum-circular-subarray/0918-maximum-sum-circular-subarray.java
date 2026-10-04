class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int currentMax = 0;
        int currentMin = 0;

        for (int num : nums) {

            total += num;

            // Maximum subarray (normal Kadane)
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Minimum subarray
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }

        // If all elements are negative,
        // total - minSum would incorrectly become 0.
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular subarray
        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}