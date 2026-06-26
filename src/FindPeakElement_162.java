public class FindPeakElement_162 {
    static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        int res=findPeakElement(arr);
        System.out.println(res);
    }
}
