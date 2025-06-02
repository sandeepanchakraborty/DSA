class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currcnt=0;
        int maxcnt=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currcnt+=nums[i];
            if(currcnt>maxcnt){
                maxcnt=currcnt;
            }

            if(currcnt<0){
                currcnt=0;
            }
        }
        return maxcnt;
    }
}