import java.util.Arrays;

public class SumOfPrimesBtwnRange_3918 {
    static int sumOfPrimesInRange(int n){
        int actual=n;
        int rev=0;
        int digits;
        int min,max;
        int k=0;
        boolean isPrime;
        while(n!=0){
            digits=n%10;
            rev=(rev*10)+digits;
            n/=10;
        }
        if(actual==rev){
            if(actual==1) return 0;
            isPrime=true;
           for(int i=2;i<actual;i++){
               if(actual%i==0){
                   isPrime=false;
               }
           }if(isPrime){
               return actual;
            }
        }
        if(actual<rev) {
            min = actual;
            max=rev;
        }else{
            max = actual;
            min=rev;
        }
        int[] primes=new int[(max-min)/2];
        for(int i=min;i<=max;i++){
            if(i==1){
                continue;
            }
            if(i==2){
                primes[k]=i;
                k++;
                continue;
            }
            if(i%2!=0){
                isPrime=true;
                for(int j=3;j<=i/2;j++){
                    if(i%j==0){
                        isPrime=false;
                    }
                }
                if(isPrime){
                    primes[k]=i;
                    k++;
                }
            }
        }
        int sum=0;
        for(int i=0;i<primes.length;i++){
            sum+=primes[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int res=sumOfPrimesInRange(1);
        System.out.println(res);
    }
}
