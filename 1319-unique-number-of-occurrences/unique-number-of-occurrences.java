class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> num_occurrences = new HashMap();
        for(int num: arr){
            num_occurrences.put(num, num_occurrences.getOrDefault(num, 0)+1);
        }
        HashSet<Integer> unique_vals = new HashSet(num_occurrences.values());
        return num_occurrences.size() == unique_vals.size();
    }
}