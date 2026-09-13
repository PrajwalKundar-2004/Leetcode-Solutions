class Solution {

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                zeroCount++;
            }
            if(zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }  
        }
        return n-left;
    }
}