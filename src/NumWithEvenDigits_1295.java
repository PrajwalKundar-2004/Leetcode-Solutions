public class NumWithEvenDigits_1295 {
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        int res = findNumbers(nums);
        System.out.println(res);
    }

    static int findNumbers(int[] nums) {
        int val;
        int digits;
        int count=0;
        for(int i=0;i<nums.length;i++){
            digits=0;
            val=nums[i];
            while(val!=0){
                digits+=1;
                val=val/10;
            }
            if(digits%2==0){
                count+=1;
            }
        }
        return count;
    }
}
