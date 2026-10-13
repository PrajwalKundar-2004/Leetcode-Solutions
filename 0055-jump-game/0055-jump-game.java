class Solution {
    public boolean canJump(int[] nums) {
      int start = 0;

        for(int i = 0; i <= start; i++) {
            start = Math.max(start, i + nums[i]);

            if(start >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}