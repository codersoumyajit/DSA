class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a','e','i','o','u'}
        count = 0
        for ch in s[:k]:
            if ch in vowels:
                count += 1
        maxcount = count

        for i in range(k, len(s)):
            if s[i-k] in vowels:
                count -= 1
            if s[i] in vowels:
                count += 1
            maxcount = max(maxcount, count)
        return maxcount
