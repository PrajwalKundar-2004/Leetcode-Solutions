class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int prefix=1,suffix=1;
        for(int i=0;i<nums.length;i++){
           if(prefix==0) prefix=1;
           if(suffix==0) suffix=1;
            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];          
            int val=Math.max(prefix,suffix);
            max=Math.max(max,val);
        }
        return max;
    }
}