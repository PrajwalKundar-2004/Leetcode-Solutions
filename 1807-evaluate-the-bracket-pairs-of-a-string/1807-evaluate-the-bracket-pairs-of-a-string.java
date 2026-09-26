class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> i:knowledge){
                map.put(i.get(0),i.get(1));
        }
        StringBuilder sb= new StringBuilder(s);
        StringBuilder search= new StringBuilder();
        int start=0,end=0;
        int n=map.size();
        int i=0;
        while(i<sb.length()){
            char c=sb.charAt(i);
            if(c=='('){
                start=i;
                i++;
                c=sb.charAt(i);
                while(c!=')'){
                    search.append(c);
                    i++;
                    c=sb.charAt(i);
                }
                i++;
                end=i;
                String value = map.get(search.toString());
                if (value != null) {
                    sb.replace(start, end, value);
                    i = start + value.length();
                }else {
                    sb.replace(start, end, "?");
                    i = start + 1;
                }
                search.setLength(0);
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}