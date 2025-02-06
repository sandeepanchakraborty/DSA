class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>start){
                start=weights[i];
            }
            end=end+weights[i];
        }
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isShipmentpossible(weights,mid,days)){
                res=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }

    boolean isShipmentpossible(int weights[],int maxcapacity,int days){
        int currentday=1;
        int capacity=0;
        for(int i=0;i<weights.length;i++){
            capacity+=weights[i];
        if(capacity>maxcapacity){
            currentday+=1;
            capacity=weights[i];
        }
        if(currentday>days){
            return false;
        }
        }
        return true;

    }
}