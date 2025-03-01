class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currentsum=0;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currentsum+=nums[i];
            if(maxcount<currentsum){
                maxcount=currentsum;
            }

            if(currentsum<0){
                currentsum=0;
            }
        }
        return maxcount;
    }
}