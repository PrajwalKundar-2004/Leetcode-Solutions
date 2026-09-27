class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int max=0;
        int count=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)){
                while(s.charAt(start)!=c){
                    set.remove(s.charAt(start));
                    start++;
                    count--;
                }
                set.remove(s.charAt(start));
                set.add(c);
                start++;
            }else{
                set.add(c);
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}