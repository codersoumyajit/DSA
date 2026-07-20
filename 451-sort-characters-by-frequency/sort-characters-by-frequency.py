class Solution:
    def frequencySort(self, s: str) -> str:
        count = {}
        for i in range(len(s)):
            count[s[i]] = count.get(s[i],0)+1

        result = ""
        for i, freq in sorted(count.items(), key=lambda x: x[1], reverse=True):
            result += i * freq
        return result