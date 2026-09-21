class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        list.sort( (a,b) -> map.get(b) - map.get(a) );
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
            while(map.get(list.get(i))!=0){
                sb.append(list.get(i));
                map.put(list.get(i),map.get(list.get(i))-1);
            }
        }
        return sb.toString();
    }
}