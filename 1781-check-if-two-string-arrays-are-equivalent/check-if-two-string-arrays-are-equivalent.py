class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        str1 = ""
        str2 = ""
        for s in word1:
            str1 = str1 + s
        for s in word2:
            str2 = str2 + s
        if str1 == str2:
            return True
        else:
            return False
    
