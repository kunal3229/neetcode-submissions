class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0) return res;
        backtrack(nums, target, 0, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int[] nums, int target, int start, ArrayList<Integer> path, List<List<Integer>> res){
        if(target < 0) return;
        else if(target == 0) res.add(new ArrayList<>(path));
        else {
            for(int i=start; i<nums.length; i++){
                path.add(nums[i]);
                backtrack(nums, target - nums[i], i, path, res);
                path.remove(path.size()-1);
            }
        }
    }
}
