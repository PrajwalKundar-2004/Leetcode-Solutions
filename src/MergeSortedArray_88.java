import java.util.Arrays;

public class MergeSortedArray_88 {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            // int size=m+n;
            // int k=0,j,key;
            // for(int i=m;i<size;i++){
            //     if(k<n){
            //         key=nums2[k];
            //         j=i-1;
            //         while(j>=0){
            //             if(nums1[j]>key){
            //                 nums1[j+1]=nums1[j];
            //                 j--;
            //             }else{
            //                 break;
            //             }
            //         }
            //         nums1[j+1]=key;
            //         k++;
            //     }
            // }
//            better approach
            int size=(m+n)-1;
            int left=m-1;
            int right=n-1;
            while(size>=0 && left>=0 && right>=0){
                if(nums1[left]>=nums2[right]){
                    nums1[size]=nums1[left];
                    left--;
                    size--;
                }else if(nums1[left]<nums2[right]){
                    nums1[size]=nums2[right];
                    right--;
                    size--;
                }
            }
            if(left==-1){
                while(right>=0){
                    nums1[size]=nums2[right];
                    right--;
                    size--;
                }
            }else if(right==-1){
                while(left>=0){
                    nums1[size]=nums1[left];
                    left--;
                    size--;
                }
            }
            System.out.println(Arrays.toString(nums1));
        }

    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3;
       int [] nums2 = {2,5,6};
       int n = 3;
       merge(nums1,m,nums2,n);
    }
}
