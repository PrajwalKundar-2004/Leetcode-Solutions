class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size=nums.length;
        int[] arr=new int[size];
        int j;
        boolean exist;
        for(int i=0;i<nums.length;i++){
            j=i+1;
            exist=false;
            while((j%size)!=i){
                j=j%size;
                if(nums[j]>nums[i]){
                    arr[i]=nums[j];
                    exist=true;
                    break;
                }
                j++;
            }
            if(exist==false){
                arr[i]=-1;
            }
        }
        return arr;
    }
}