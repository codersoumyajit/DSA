class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        count1 = 0
        count2 = 0
        mid = len(s) // 2
        first = s[:mid]
        second = s[mid:]
        vowels = "aeiouAEIOU"
        for i in first:
            if i in vowels:
                count1 += 1
        for i in second:
            if i in vowels:
                count2 += 1
        if count1 == count2:
            return True
        else:
            return False
