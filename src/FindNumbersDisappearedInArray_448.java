import java.util.ArrayList;
import java.util.List;

public class FindNumbersDisappearedInArray_448 {
    static List<Integer> findDisappearedNumbers(int[] nums) {
      int n=nums.length;
      int freq[]=new int[n+1];
      for(int i=0;i<n;i++){
            freq[nums[i]]++;
      }
      List<Integer> list=new ArrayList<>();
      for(int i=1;i<=n;i++){
          if(freq[i]==0){
              list.add(i);
          }
      }
      return list;
    }

    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        List<Integer> res=findDisappearedNumbers(nums);
        System.out.println(res);
    }
}
