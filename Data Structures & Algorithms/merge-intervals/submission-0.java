class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] prev = intervals[0];
        List<int[]> res = new ArrayList<>();
        for(int[] interval : intervals){
            int start = interval[0];
            int end = interval[1];
            if(start <= prev[1]) prev[1] = Math.max(prev[1], end);
            else {
                res.add(prev);
                prev = interval;
            }
        }
        res.add(prev);
        return res.toArray(new int[res.size()][]);
    }
}
