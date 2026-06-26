
public class PeakIndexInMountainArray_852 {
    static int peakIndexInMountainArray(int[] arr) {
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        int low=0;
//        int high=arr.length-1;
//        int mid;
//        while(low<=high){
//            mid=low+((high-low)/2);
//            if(arr[mid]==max){
//                return mid;
//            }
//            else if(arr[mid]<max){
//                if(arr[mid+1]>arr[mid]){
//                    low=mid+1;
//                }else{
//                    high=mid-1;
//                }
//            }
//        }
//        return -1;
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr={24,69,100,99,79,78,67,36,26,19};
        int res=peakIndexInMountainArray(arr);
        System.out.println(res);
    }
}
