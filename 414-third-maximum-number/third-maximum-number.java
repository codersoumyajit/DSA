class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> maximums = new PriorityQueue<>();
        Set<Integer> seen = new HashSet<>();

        for (int n : nums) {
            if (!seen.add(n)) continue;

           maximums.offer(n);
           if (maximums.size() > 3) maximums.poll();
        }

        if (maximums.size() != 3) {
            while (maximums.size() != 1) maximums.poll();
        }

        return maximums.peek();
    }
}