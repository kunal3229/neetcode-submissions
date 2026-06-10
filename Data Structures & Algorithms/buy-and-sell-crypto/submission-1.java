class Solution {
    public int maxProfit(int[] prices) {
        int res = Integer.MIN_VALUE;
        int minSoFar = prices[0];
        for(int num : prices){
            int profit = num - minSoFar;
            res = Math.max(res, profit);
            minSoFar = Math.min(minSoFar, num);
        }
        return res;
    }
}
