class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        for(int i=0;i<n;i++){
            int prod=nums[i];
            for(int j=i+1;j<n;j++){
                  res=Math.max(res,prod);
                prod*=nums[j];
              
            }
             res=Math.max(res,prod);
        }
        return res;
    }
}