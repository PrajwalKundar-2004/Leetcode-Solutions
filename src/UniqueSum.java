import java.util.Arrays;

public class UniqueSum {
    public static int sumOfUnique(int[] nums) {
        int sum=0;
        int max=Arrays.stream(nums).max().getAsInt();
        int[] frequency=new int[max+1];
        for(int i=0;i<nums.length;i++){
            frequency[nums[i]]++;
        }
        for(int i=0;i< frequency.length;i++){
            if(frequency[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,2};
        int res=sumOfUnique(nums);
        System.out.println(res);
    }
}
