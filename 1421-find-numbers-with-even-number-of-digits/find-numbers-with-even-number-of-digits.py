class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        sum = 0
        for i in range(len(nums)):
            if(len(str(nums[i])) % 2 == 0):
                sum = sum + 1
        return sum