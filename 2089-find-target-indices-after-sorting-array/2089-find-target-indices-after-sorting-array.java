class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                while(i<nums.length && nums[i]==target){
                    list.add(i);
                    i++;
                }
                break;
            }
        }
        return list;
    }
}