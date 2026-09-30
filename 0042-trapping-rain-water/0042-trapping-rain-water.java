class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int left=0,right=0;
        int low=0,high=len-1;
        int drops=0;
        while(low<high){
            if(height[low]>left){
                left=height[low];
            }
            if(height[high]>right){
                right=height[high];
            }
            if(left<=right){
                drops+=(left-height[low]);
                low++;
            }else{
                drops+=(right-height[high]);
                high--;
            }
        }
        return drops;
    }
}