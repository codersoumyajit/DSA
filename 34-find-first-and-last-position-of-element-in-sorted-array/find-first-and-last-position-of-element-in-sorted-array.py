class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        output = []
        for i in range(len(nums)):
            if nums[i] == target:
                output.append(i)
        if len(output)  == 0:
            return [-1, - 1]
        return [output[0], output[-1]]       
