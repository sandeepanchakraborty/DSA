class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int current=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
             max=Math.max(max,i+nums[i]);
            if(i==current){
               jumps++;
               current=max;
            }
           
        }
        return jumps;
    }
}