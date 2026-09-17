class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=201;
        String search="";
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                search=strs[i];
            }
        }
        int i=0;
        StringBuilder ans=new StringBuilder();
        while(i<search.length()){
            char c=search.charAt(i);
            for(int j=0;j<strs.length;j++){
                if((strs[j].charAt(i))!=c){
                    return ans.toString();
                }
            }
            ans.append(c);
            i++;
        }
        return ans.toString();
    }
}