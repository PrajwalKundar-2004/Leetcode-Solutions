public class MinRotSortedArray_153 {
    public static void main(String[] args) {
       int[] nums={3,4,5,0,1} ;
       int res=findMin(nums);
        System.out.println(res);
    }
    static int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]>nums[nums.length-1]){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>nums[i+1]){
                    return nums[i+1];
                }
            }
        }else{
            return nums[0];
        }
        return 0;
    }
}
