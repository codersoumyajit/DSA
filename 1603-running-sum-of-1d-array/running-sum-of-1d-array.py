class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = 0
        result = [0] * len(nums)
        for i in range(len(nums)):           
            sum = sum + nums[i]
            result[i] = sum
        return result