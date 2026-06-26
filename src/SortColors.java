import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int len=nums.length;
        int temp;
        boolean flag;
        for(int i=0;i<(nums.length-1);i++){
            flag=true;
            for(int j=0;j<(nums.length-1-i);j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args){
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
    }

}
