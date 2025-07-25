import java.util.HashMap;

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> numCounts = new HashMap<>();
        HashMap<Integer, Integer> firstSeen = new HashMap<>();
        
        int degree = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            firstSeen.putIfAbsent(num, i);
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
            
            if (numCounts.get(num) > degree) {
                degree = numCounts.get(num);
                minLength = i - firstSeen.get(num) + 1;
            } else if (numCounts.get(num) == degree) {
                minLength = Math.min(minLength, i - firstSeen.get(num) + 1);
            }
        }

        return minLength;
    }
}
