class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count = {}
        for i in range(len(arr)):
            if arr[i] in count:
                count[arr[i]] = count.get(arr[i],0)+1
            else:
                count[arr[i]] = 1
        seen = set()
        for values in count.values():
            if values in seen:
                return False
            else:
                seen.add(values)
        return True
