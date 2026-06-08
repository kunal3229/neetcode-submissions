class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums) numSet.add(num);
        int longest = 0;

        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int length = 1;
                while(numSet.contains(num + length)) length++;
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

// public class Solution {
//     public int longestConsecutive(int[] nums) {
//         int res = 0;
//         Set<Integer> store = new HashSet<>();
//         for (int num : nums) {
//             store.add(num);
//         }

//         for (int num : nums) {
//             int streak = 0, curr = num;
//             while (store.contains(curr)) {
//                 streak++;
//                 curr++;
//             }
//             res = Math.max(res, streak);
//         }
//         return res;
//     }
// }
