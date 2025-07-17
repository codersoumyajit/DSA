class Solution {
    public int maximumLength(int[] nums, int k) {
        int n = nums.length;
        int dp[][] = new int[n][k];

        Arrays.stream(dp).forEach(a -> Arrays.fill(a, 1));

        int maxLen = 0;

        for(int i=1; i < n;i++){
            for(int j=i-1;j>=0; j--){
                int rem = (nums[i] + nums[j]) % k;

                dp[i][rem] = Math.max(dp[i][rem], dp[j][rem]+1);
                maxLen = Math.max(dp[i][rem], maxLen);
            }
        }
        return maxLen;
    }
}