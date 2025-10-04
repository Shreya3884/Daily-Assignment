public class Solution {
    public int maxSubArray(int[] nums) {
        return helper(nums, nums.length - 1, new int[nums.length]);
    }

    private int helper(int[] nums, int i, int[] dp) {
        if (i == 0) {
            dp[0] = nums[0];
            return nums[0];
        }
        if (dp[i] != 0) return dp[i];
        int prev = helper(nums, i - 1, dp);
        dp[i] = Math.max(nums[i], nums[i] + prev);
        return Math.max(dp[i], prev);
    }
}
 
