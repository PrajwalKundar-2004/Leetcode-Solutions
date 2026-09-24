class Solution {
    public int smallestIndex(int[] nums) {
        int ans;
        int val,sum;
        for(int i=0;i<nums.length;i++){
            ans=nums[i];
            val=nums[i];
            if(ans>9){
                sum=0;
                while(val!=0){
                    int digit=val%10;
                    sum+=digit;
                    val=val/10;
                }
                ans=sum;
            }
            if(ans==i){
               return i;
            }
        }
        return -1;

    }
}