class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[start]<=nums[mid]){
                min=Math.min(nums[start],min);
                start=mid+1;
            }else{
                min=Math.min(min,nums[mid]);
                end=mid-1;
            }
        }
        return min;
    }
}