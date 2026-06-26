import java.util.Arrays;

public class OppositeParity_3917 {
    static int[] countOppositeParity(int[] nums){
        int[] parity=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2!=0){
                        parity[i]++;
                    }
                }
            }else{
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]%2==0){
                        parity[i]++;
                    }
                }
            }

        }
        return parity;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = countOppositeParity(nums);
        System.out.println(Arrays.toString(res));
    }
}
