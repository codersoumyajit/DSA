class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
                for(int i : nums){
                    pq.add(i);
                    if(pq.size()>k){
                        pq.remove();
                    }
                }
                return pq.remove();
    }
}