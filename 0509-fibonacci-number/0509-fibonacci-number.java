class Solution {
    public int fib(int n) {
        int f1=0,f2=1,f3=0;
        if(n==0){
            return f1;
        }
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
}