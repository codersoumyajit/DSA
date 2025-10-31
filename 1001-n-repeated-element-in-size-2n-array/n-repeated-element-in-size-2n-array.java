class Solution {
    public int repeatedNTimes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums){
            if(list.contains(i)) return i;
            else list.add(i);
        }
        return 0;
    }
}