class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int count=0;
        int start=0;
        for(int i=0;i<fruits.length;i++){
            if(map.size()<2 || map.containsKey(fruits[i])){
                map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
                count++;
            }else{
                int val=fruits[start];
                while(map.get(val)>0){
                    map.put(val,map.get(val)-1);
                    count--;
                    start++;

                    if(map.get(val)==0){
                        map.remove(val);
                        map.put(fruits[i],1);
                        count++;
                        break;
                    }
                    val=fruits[start];
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}