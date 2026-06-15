class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(candidates.length == 0) return res;
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int[] nums, int target, int start, ArrayList<Integer> path, List<List<Integer>> res){
        if(target < 0) return;
        else if(target == 0) res.add(new ArrayList<>(path));
        else{
            for(int i=start; i<nums.length; i++){
                if(i > start && nums[i] == nums[i-1]) continue;
                path.add(nums[i]);
                backtrack(nums, target - nums[i], i+1, path, res);
                path.remove(path.size()-1);
            }
        }
    }
}
