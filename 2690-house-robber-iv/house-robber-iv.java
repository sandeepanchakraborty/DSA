class Solution {
    private boolean canSteal(int[] nums, int k, int cap) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= cap) {
                count++;
                i++;  // Skip next house
            }
        }
        return count >= k;
    }
    public int minCapability(int[] nums, int k) {
        int left = Arrays.stream(nums).min().getAsInt(), right = Arrays.stream(nums).max().getAsInt();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSteal(nums, k, mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}