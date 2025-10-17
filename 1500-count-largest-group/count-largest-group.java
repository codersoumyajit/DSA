class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxGroupSize = 0;
        for(int number = 1; number <= n; number++){
            int digitSum = 0;
            int temp = number;

            while(temp != 0){
                digitSum += temp % 10;
                temp /= 10;
            }

            map.put(digitSum, map.getOrDefault(digitSum,0) + 1);
            maxGroupSize = Math.max(maxGroupSize, map.get(digitSum));
        }

        int largestGroupCount = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxGroupSize){
                ++largestGroupCount;
            }
        }
        return largestGroupCount;
    }
}