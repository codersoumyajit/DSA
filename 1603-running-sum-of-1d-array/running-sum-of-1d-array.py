class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = 0
        ans = [0] * len(nums)
        for i in range(len(nums)):
            sum = sum + nums[i]
            ans[i] = sum
        return ans