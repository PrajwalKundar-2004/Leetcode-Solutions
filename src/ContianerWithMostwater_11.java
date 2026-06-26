public class ContianerWithMostwater_11 {
    public static void main(String[] args) {
        int[] height = {100,1,2,100,40,50};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {
       int sum=0;
       int maxSum=0;
       int low=0;
       int high=height.length-1;
        while(low!=high){
            if(height[low]<=height[high]){
                sum=height[low]*(high-low);
                low++;
            }else if(height[low]>height[high]){
                sum=height[high]*(high-low);
                high--;
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
       return maxSum;
    }
}
