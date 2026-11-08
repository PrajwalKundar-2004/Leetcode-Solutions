
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        long k = (long) k1 + k2;

        int maxDiff = 0;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        int[] freq = new int[maxDiff + 1];

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
        }

        // Reduce the largest differences first
        for (int i = maxDiff; i > 0 && k > 0; i--) {

            int reduce = (int) Math.min(freq[i], k);

            freq[i] -= reduce;
            freq[i - 1] += reduce;

            k -= reduce;
        }

        // Calculate the final squared difference
        long sum = 0;

        for (int i = 0; i <= maxDiff; i++) {
            sum += (long) i * i * freq[i];
        }

        return sum;
    }
}
