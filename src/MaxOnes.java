public class MaxOnes {
    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (count > max) {
                    max = count;
                }
                count = 0;

            } else {
                count++;
            }
        }
        return (count>max)? count:max;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int res = findMaxConsecutiveOnes(nums);
        System.out.println(res);
    }
}

