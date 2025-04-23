class Solution {
    public int minEatingSpeed(int[] arr, int h) {
         int start=1;
        int end=Integer.MIN_VALUE;

        //finding max

        for(int i=0;i<arr.length;i++){
            if(arr[i]>end){
                end=arr[i];
            }
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isEatingSpeedValid(arr,mid,h)){
                ans=mid;
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return ans;

    }
     boolean isEatingSpeedValid(int arr[],int eatingspeed,int hours){
        int hourspent=0;
        for(int i=0;i<arr.length;i++){
            hourspent+=arr[i]/eatingspeed;
            if(arr[i]%eatingspeed!=0){
                hourspent+=1;
            }
            if(hourspent>hours) return false;
        }
        return true;
    }
}