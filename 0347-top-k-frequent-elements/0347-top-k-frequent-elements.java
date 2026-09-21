class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int[] res=new int[k];
        List<Integer> list=new ArrayList<>(map.keySet());
        list.sort( (a,b) ->  map.get(b) - map.get(a) );
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
       return res;
    }
}