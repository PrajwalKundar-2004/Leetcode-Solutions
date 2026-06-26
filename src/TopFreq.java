import java.util.Arrays;

public class TopFreq {
    public static int[] topKFrequent(int[] nums, int k) {
        int max=Arrays.stream(nums).max().getAsInt();
        int[] freq=new int[max+1];
        int[] store=new int[k];
        int z=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int highest;
        for(int m=0;m<freq.length;m++){
            highest=Arrays.stream(freq).max().getAsInt();
            if(freq[m]==highest){
                store[z]=m;
                freq[m]=0;
                if(z<(k-1)){
                    z++;
                    m=0;
                }
            }

        }
    return store;
    }
    public static void main(String[] args){
        int[] nums={1,2,1,2,1,2,3,1,3,2};
        int k=2;
        int[] res=topKFrequent(nums,2);
        System.out.println(Arrays.toString(res));
    }

}
