class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while(low<high-1){
                if(numbers[low]+numbers[high]==target){
                    return new int[]{low+1,high+1};
                }else if(numbers[low]+numbers[high]>target){
                    high--;
                }else if(numbers[low]+numbers[high]<target){
                    low++;
                }
        }
        return new int[]{low+1,high+1};
    }
}