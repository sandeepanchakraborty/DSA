class Solution {
public  int findMin(int[] arr) {
        int n=arr.length;
        int start=0;
        int end=n-1;
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[mid]){
                min=Math.min(arr[start],min);
                start=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                end=mid-1;
            }

        }
        return min;
    }
}