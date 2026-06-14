class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        for(int num : nums){
            int temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}

// class Solution {
//     public int rob(int[] nums) {
//         if(nums.length == 0) return 0;
//         if(nums.length == 1) return nums[0];

//         int[] dp = new int[nums.length];
//         dp[0] = nums[0];
//         dp[1] = Math.max(nums[0], nums[1]);

//         for(int i=2; i<nums.length; i++){
//             dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
//         }
//         return dp[nums.length-1];
//     }
// }


// public class Solution {
//     private int[] memo;

//     public int rob(int[] nums) {
//         memo = new int[nums.length];
//         Arrays.fill(memo, -1);
//         return dfs(nums, 0);
//     }

//     private int dfs(int[] nums, int i) {
//         if (i >= nums.length) {
//             return 0;
//         }
//         if (memo[i] != -1) {
//             return memo[i];
//         }
//         memo[i] = Math.max(dfs(nums, i + 1),
//                          nums[i] + dfs(nums, i + 2));
//         return memo[i];
//     }
// }
