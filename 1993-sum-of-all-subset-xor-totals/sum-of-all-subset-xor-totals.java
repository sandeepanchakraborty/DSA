class Solution {
    public int dfs(int[] nums, int index, int currXOR) {
        if (index == nums.length) {
            return currXOR;
        }

        int take = dfs(nums, index + 1, currXOR ^ nums[index]);
        int notTake = dfs(nums, index + 1, currXOR);

        return take + notTake;
    }

    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }
}