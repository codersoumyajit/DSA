class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count1 = {}
        count2 = {}
        for i in range(len(s)):
            if s[i] in count1:
                count1[s[i]]=count1.get(s[i],0)+1
            else:
                count1[s[i]] = 1
        for j in range(len(t)):
            if t[j] in count2:
                count2[t[j]]=count2.get(t[j],0)+1
            else:
                count2[t[j]] = 1
        if count1 == count2:
            return True
        else:
            return False
