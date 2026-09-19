class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int sum=0;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+nums[i];
        //     if(Math.abs(nums[i])>Math.abs(sum)){
        //         sum=nums[i];
        //     }
        //     max=Math.max(Math.abs(sum),max);
        // }
        // return max;

        // better approach
        int sum = 0;
        int maxSum = 0;
        int minSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            maxSum = Math.max(maxSum, sum);
            minSum = Math.min(minSum, sum);
        }

        return maxSum - minSum;
    }
}