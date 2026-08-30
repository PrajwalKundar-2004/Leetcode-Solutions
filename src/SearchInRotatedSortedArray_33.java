public class SearchInRotatedSortedArray_33 {
    static int findPeak(int l,int h,int[] num){
        while(l<h){
            int mid=(l+h)/2;
            if(num[mid]<num[l]){
                h=mid-1;
            } else if (num[mid]>num[l]) {
                if(num[mid]>num[mid+1]){
                    return mid;
                }else{
                    l=mid+1;
                }
            }else{
                if(mid+1>mid){
                    return mid+1;
                }
            }
        }
        return l;
    }
    static int binarysearch(int[] num,int l,int h,int target){
        while(l<=h){
            int mid=(l+h)/2;
            if(num[mid]==target){
                return mid;
            }else if(num[mid]<target){
                l=mid+1;
            }else if(num[mid]>target){
                h=mid-1;
            }
        }
        return -1;
    }
    static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int peak=findPeak(low,high,nums);
        System.out.println(peak);
        if(nums[peak]==target){
            return peak;
        }
        int firsthalf=binarysearch(nums,low,peak,target);
        int secondhalf=binarysearch(nums,peak+1,high,target);
        if(firsthalf!=-1){
            return firsthalf;
        }else if(secondhalf!=-1){
            return secondhalf;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={6,7};
        int target=6;
        int res=search(nums,target);
        System.out.println(res);
    }
}
//        while(l<h){
//            if(num[l]>num[l+1]){
//                return l;
//            }else{
//                l++;
//            }
//            if(num[h]<num[h-1]){
//                return h-1;
//            }else{
//                h--;
//            }
//        }