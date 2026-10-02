class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double[] merge=new double[m+n];
        int j=0;
        int len1=0,len2=0;
         while(len1!=nums1.length && len2!=nums2.length){
            if(nums1[len1]<=nums2[len2]){
                merge[j]=nums1[len1];
                j++;
                len1++;
            }else if(nums1[len1]>nums2[len2]){
                merge[j]=nums2[len2];
                j++;
                len2++;
            }
         }
         if(len1==nums1.length){
            while(len2!=nums2.length){
                merge[j]=nums2[len2];
                j++;
                len2++;
            }
         }else if(len2==nums2.length){
            while(len1!=nums1.length){
                merge[j]=nums1[len1];
                j++;
                len1++;
            }
         }
        int mid=merge.length/2;
        if(merge.length%2==1){
            return merge[mid];
        }else{
            return ((merge[mid-1]+merge[mid])/2);
        }
    }
}