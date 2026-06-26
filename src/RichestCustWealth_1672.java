import java.util.Arrays;

public class RichestCustWealth_1672 {
    public static void main(String[] args) {
        int[][] nums = {
                {1,5},
                {7,3},
                {3,5}
        };
        int res = maximumWealth(nums);
        System.out.println(res);
    }
    static int sum(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }

    static int maximumWealth(int[][] accounts) {
        int max=0;
        int test;
        for(int[] arr:accounts){
            test=sum(arr);
            if(test>max){
                max=test;
            }
        }
        return max;
    }
}
