class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        currsum = 0
        maxsum = 0
        for i in range(len(nums)):
            if(nums[i] == 1):
                currsum += 1
                if(currsum > maxsum):
                    maxsum = currsum
            else:
                currsum = 0
        return maxsum