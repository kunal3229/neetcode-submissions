class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0) return res;
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int[] nums, int start, ArrayList<Integer> path, List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        for(int i=start; i<nums.length; i++){
            path.add(nums[i]);
            backtrack(nums, i+1, path, res);
            path.remove(path.size()-1);
        }
    }
}
