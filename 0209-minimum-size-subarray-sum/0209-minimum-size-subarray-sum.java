class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int count = 0;
        int min = 0;
        int low = 0;
        int high = 0;
        int sum = 0;

        while (high < nums.length) {

            if (nums[high] >= target) {
                return 1;
            } else {
                sum = sum + nums[high];
                count++;
            }

            while (sum >= target) {

                if (min == 0 || count < min) {
                    min = count;
                }

                sum = sum - nums[low];
                count--;
                low++;
            }

            high++;
        }

        return min;
    }
}