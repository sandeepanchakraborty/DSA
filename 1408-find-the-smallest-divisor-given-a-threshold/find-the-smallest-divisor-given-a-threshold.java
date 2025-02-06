class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int start=1;
        int end=Integer.MIN_VALUE;
        //for finding max

        for(int i=0;i<arr.length;i++){
            if(end<arr[i]){
                end=arr[i];
            }

        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isThresholdvalid(arr,mid,threshold)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
      boolean isThresholdvalid(int arr[],int validthreshold,int threshold){
        int currentthreshold=0;
        for(int i=0;i<arr.length;i++){
            currentthreshold+=arr[i]/validthreshold;
            if(arr[i]%validthreshold!=0){
                currentthreshold+=1;
            }
            if(currentthreshold>threshold) return false;
        }
        return true;
    }
}