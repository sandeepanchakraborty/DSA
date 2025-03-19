class Solution {
    public int minOperations(int[] nums) {
        // If array is too small, check if transformation is possible
        if (nums.length < 3) {
            for (int num : nums) {
                if (num == 0) return -1; // Impossible to fix
            }
            return 0; // Already all 1s
        }

        int count = 0;
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == 0) {
                // Flip current element and next two
                nums[i] = 1;
                nums[i + 1] ^= 1; // Toggle 0 ↔ 1
                nums[i + 2] ^= 1;
                count++;
            }
        }

        // Check if the last two elements are both 1s
        return (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 1) ? count : -1;
    }
}