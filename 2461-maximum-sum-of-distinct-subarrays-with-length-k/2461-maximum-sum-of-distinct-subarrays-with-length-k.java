class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        long sum=0;
        long max=0;
        int n=nums.length;
        int count=0;
        int i=0;
        int start=0;
        while(i<n){
            if(!(set.contains(nums[i]))){
                set.add(nums[i]);
                sum=sum+nums[i];
                count++;
                i++;
            }else{
                sum=sum-nums[start];
                set.remove(nums[start]);
                start++;
                count--;

            }
            if(count==k){
                max=Math.max(max,sum);
                sum=sum-nums[start];
                set.remove(nums[start]);
                start++;
                count--;
            }
        }
       
        return max;
    }
}