class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        leftsum = 0
        total = sum(nums)
        for i in range(len(nums)):
            
            rightsum = total - leftsum - nums[i]
            if rightsum == leftsum:
                return i
            else:
                leftsum += nums[i]
        return -1
