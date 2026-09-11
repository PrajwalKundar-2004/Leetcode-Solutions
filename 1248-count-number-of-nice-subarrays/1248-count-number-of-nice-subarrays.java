class Solution {

    public int numberOfSubarrays(int[] nums, int k) {

        int[] odd = new int[nums.length];
        int count = 0;

        // Store positions of odd numbers
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1) {
                odd[count] = i;
                count++;
            }
        }

        if(count < k) {
            return 0;
        }

        int total = 0;

        // Consider every group of k consecutive odd numbers
        for(int i = 0; i <= count - k; i++) {

            int low = odd[i];
            int high = odd[i + k - 1];

            int before;

            if(i == 0) {
                before = low + 1;
            } else {
                before = low - odd[i - 1];
            }

            int after;

            if(i + k == count) {
                after = nums.length - high;
            } else {
                after = odd[i + k] - high;
            }

            total += before * after;
        }

        return total;
    }
}