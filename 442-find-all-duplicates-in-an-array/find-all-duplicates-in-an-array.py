class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        result = []
        seen = set()
        for i in range(len(nums)):
            if nums[i] in seen:
                result.append(nums[i])
            else:
                seen.add(nums[i])
        return result


                    

            

