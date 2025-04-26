class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int n = nums.length;
        int minKIndex = -1;
        int maxKIndex = -1;
        int leftBound = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i;
                minKIndex = -1;
                maxKIndex = -1;
                continue;
            }

            if (nums[i] == minK) {
                minKIndex = i;
            }

            if (nums[i] == maxK) {
                maxKIndex = i;
            }

            if (minKIndex != -1 && maxKIndex != -1) {
                count += Math.min(minKIndex, maxKIndex) - leftBound;
            }
        }
        return count;
    }
}