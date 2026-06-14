class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int prev1 = 2;
        int prev2 = 1;
        for(int i=3; i<=n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

// class Solution {
//     public int climbStairs(int n) {
//         if(n <= 2) return n;
//         int[] dp = new int[n+1];
//         dp[1] = 1;
//         dp[2] = 2;

//         for(int i=3; i<=n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
// }


// class Solution {
//     int[] cache;
//     public int climbStairs(int n) {
//         cache = new int[n+1];
//         Arrays.fill(cache, -1);
//         return dfs(n);
//     }
//     public int dfs(int n){
//         if(n <= 2) return n;
//         if(cache[n] != -1) return cache[n];
//         return cache[n] = dfs(n-1) + dfs(n-2);
//     }
// }
