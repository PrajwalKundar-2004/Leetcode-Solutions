interface MountainArray {
     public int get(int index);
     public int length() ;
}
class MyMountainArray implements MountainArray{
    int[] arr;
    MyMountainArray(int[] arr){
        this.arr=arr;
    }
    public int get(int index){
        return arr[index];
    }
    public int length(){
        return arr.length;
    }
}
public class FindInMoutainArray_1095 {
    static int findPeak(MountainArray mountainArray,int l,int h){
        while(l<h){
            int mid=(l+h)/2;
            if(mountainArray.get(mid+1)>mountainArray.get(mid)){
                l=mid+1;
            }else {
                h=mid;
            }
        }
        return l;
    }
    static int binarysearch1(MountainArray mountainArray,int l,int h,int target){
        while(l<=h){
            int mid=(l+h)/2;
            if(mountainArray.get(mid)==target){
                return mid;
            }else if(mountainArray.get(mid)<target){
                l=mid+1;
            }else if(mountainArray.get(mid)>target){
                h=mid-1;
            }
        }
        return -1;
    }
    static int binarysearch2(MountainArray mountainArray,int l,int h,int target){
        while(l<=h){
            int mid=(l+h)/2;
            if(mountainArray.get(mid)==target){
                return mid;
            }else if(mountainArray.get(mid)>target){
                l=mid+1;
            }else if(mountainArray.get(mid)<target){
                h=mid-1;
            }
        }
        return -1;
    }
    static int findInMountainArray(int target, MountainArray mountainArr) {
       int low=0;
       int high=mountainArr.length()-1;
       int peak=findPeak(mountainArr,low,high);
       int firsthalf=binarysearch1(mountainArr,low,peak,target);
       if(firsthalf!=-1){
           return firsthalf;
       }
       int secondhalf=binarysearch2(mountainArr,peak,high,target);
       if(secondhalf!=-1){
            return secondhalf;
        }
       return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,5,2};
        MountainArray mountainArr=new MyMountainArray(arr);
        int target=2;
        int res=findInMountainArray(target,mountainArr);
        System.out.println(res);
    }
}
