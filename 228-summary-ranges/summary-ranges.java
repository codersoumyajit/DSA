class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if (start != nums[i]) {
                ans.add(start + "->" + nums[i]);
            } else {
                ans.add(String.valueOf(start));
            }
            i++;
        }

        return ans;
    }
}
