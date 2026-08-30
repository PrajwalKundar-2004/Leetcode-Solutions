import java.util.Arrays;

public class RotateArray_189 {
        public static void reverse(int[] nums,int low,int high){
            int temp;
            while(low<high){
                temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                low++;
                high--;
            }
        }
        public static void rotate(int[] nums, int k) {
            k=k%nums.length;
            if(k==0){
                return;
            }
            // int[] rotated=new int[k];
            // int last=nums.length-1;
            // for(int i=k-1;i>=0;i--){
            //     rotated[i]=nums[last];
            //     last--;
            // }
            // for(int i=nums.length-1;i>=0;i--){
            //     if(i>k-1){
            //         nums[i]=nums[i-k];
            //     }else{
            //         nums[i]=rotated[i];
            //     }
            // }
            // bettter approach by using  three reversal technique
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
            System.out.println(Arrays.toString(nums));
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
}
