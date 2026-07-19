class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        output = []
        for i in range(len(nums)):
            square = nums[i] * nums[i]
            output.append(square)
        output.sort()
        return output

