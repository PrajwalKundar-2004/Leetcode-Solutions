class Solution {
    public boolean hasAlternatingBits(int n) {
        int count=0;
            if((n&1)==1){
                while(n!=0){
                    if((n&1)==1){
                        count++;
                    }else{
                        count--;
                    }
                    n= n >>> 1;
                    if(count>1 || count<0){
                        return false;
                    }
                }
            }else{
                 while(n!=0){
                    if((n&1)==0){
                        count++;
                    }else{
                        count--;
                    }
                    n= n >>> 1;
                    if(count>1 || count<0){
                        return false;
                    }
                }
            }
        return true;
    }
}