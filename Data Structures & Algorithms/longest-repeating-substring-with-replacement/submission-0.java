class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;
        int left = 0, maxCount = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0)+1);
            maxCount = Math.max(maxCount, count.get(ch));
            while((right-left+1) - maxCount > k){
                count.put(s.charAt(left), count.get(s.charAt(left))-1);
                left++;
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}
