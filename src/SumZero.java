import java.util.Arrays;

public class SumZero {
    public static int[] zeroSum(int n) {
        if(n==1) return new int[] {0};
        int[] nums=new int[n];
        int mid=n/2;
        if(n%2==0){
            for(int i=0;i<mid;i++){
               nums[i]=(i+1);
               nums[mid+i]=-(i+1);
            }
        }else{
            for(int i=0;i<n;i++){
                nums[i]=(i+1);
                nums[mid+i]=-(i+1);
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int n=8;
        int[] res=zeroSum(n);
        System.out.println(Arrays.toString(res));
    }
}
