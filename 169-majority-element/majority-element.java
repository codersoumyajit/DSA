class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int n : nums){
            if(map.get(n) > nums.length/2){
                return n;
            }
        }
        return -1;
    }
}