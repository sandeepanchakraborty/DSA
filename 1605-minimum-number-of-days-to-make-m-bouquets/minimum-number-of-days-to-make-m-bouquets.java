class Solution {
    public int minDays(int[] arr, int m, int k) {
        long val=(long)m*k;
        int n=arr.length;
        if(val>n) return -1;

        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,arr[i]);
            maxi=Math.max(maxi,arr[i]);
        }
        int start=mini,end=maxi;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (possible(arr,mid,m,k)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;




    }
    public boolean possible(int[] arr,int day,int m,int k){
        int n=arr.length;
        int cnt=0;
        int noofB=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
            }else{
                noofB+=(cnt/k);
                cnt=0;
            }
        }
        noofB+=(cnt/k);
        return noofB>=m;
    }
}