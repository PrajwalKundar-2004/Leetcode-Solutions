public class FirstUniqueEvenElement_3866 {
        public static  int firstUniqueEven(int[] nums) {
            boolean unique;
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2==0 && nums[i]!=-1){
                    unique=true;
                    for(int j=i+1;j<nums.length;j++){
                        if(nums[j]==nums[i]){
                            unique=false;
                            nums[j]=-1;
                        }
                    }
                    if(unique){
                        return nums[i];
                    }
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] nums = {4,4};
        System.out.println(firstUniqueEven(nums));
    }
}
