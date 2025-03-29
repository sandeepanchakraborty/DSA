class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;//length of the array
        for(int i=0;i<n;i++){ //iterate through element
            int num=nums[i];
            int count=0;
            for(int j=0;j<n;j++){ //count the occurence of each element
                if(nums[j]==num)
                count++;
            }
            if(count==1) return num;
        }
        return -1;
    }
}