class Solution {
    public int minimumIndex(List<Integer> nums) {
        int maxfreq = 0;
        int freq = 0;
        for(int i : nums){
            if(freq==0) maxfreq = i;
            if(i==maxfreq) freq++;
            else freq--;
        }

        freq = 0;
        for(int i : nums){
            if(i==maxfreq) freq++;
        }

        int count = 0;
        int len = nums.size();
        for(int i=0 ; i<len; i++){
            if(nums.get(i)==maxfreq){
                freq--;
                count++;
            }
            if(count*2>i+1 && freq*2 > len-i-1){
                return i;
            }
        }
        return -1;
    }
}