class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        count1 = {}
        count2= {}
        for i in range(len(magazine)):
            count1[magazine[i]] = count1.get(magazine[i],0)+1
        for j in range(len(ransomNote)):
            count2[ransomNote[j]] = count2.get(ransomNote[j],0)+1

        for ch in count2:
            if count2[ch] > count1.get(ch, 0):
                return False
        return True