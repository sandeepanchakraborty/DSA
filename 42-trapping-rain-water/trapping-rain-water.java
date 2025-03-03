class Solution {
    public int trap(int[] height) {
        int total=0;
        int n=height.length;
        int left=0,right=n-1;

        int maxFromLeft=0,maxFromRight=0;
        while(left<right){
            if(height[left]<height[right]){
                maxFromLeft=Math.max(maxFromLeft,height[left]);
                total+=maxFromLeft-height[left++];
            }else{
                maxFromRight=Math.max(maxFromRight,height[right]);
                total+=maxFromRight-height[right--];
            }
        }
        return total;
    }
}