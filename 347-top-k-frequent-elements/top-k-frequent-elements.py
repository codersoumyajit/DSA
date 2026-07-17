class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        for i in range(len(nums)):
            if nums[i] in count:
                count[nums[i]] = count.get(nums[i], 0)+1
            else:
                count[nums[i]] = 1
        sortedFreq = sorted(count.items(), key=lambda x: x[1], reverse=True)

        result = []

        for i in range(k):
            result.append(sortedFreq[i][0])

        return result
            