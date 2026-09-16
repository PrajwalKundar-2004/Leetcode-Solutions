class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int[] res=new int[nums.length];
        for(int i=nums.length-1;i>0;i--){
            sum+=nums[i];
            res[i]=sum;
        }
        sum=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 && sum==0){
                return i;
            }else if(i<nums.length-1){
                if(sum==res[i+1]){
                    return i;
               }
             sum=sum+nums[i];
            }
        }
        return -1;
    }
}