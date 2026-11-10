class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)(m*k)>n){
            return -1;
        }
        int min=bloomDay[0];
        int max=bloomDay[0];
        for(int i=0;i<n;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int ans=-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(canMake(bloomDay,m,k,mid)){
                ans=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
    boolean canMake(int[] bloomDay,int m,int k,int day){
        int count=0,bouquet=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                count++;
                if(count==k){
                    bouquet++;
                    count=0;
                }
            }else{
                count=0;
            }
        }
        return bouquet>=m;
    }
}