class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapST = {}
        mapTS = {}

        for i in range(len(s)):

            # Check s -> t mapping
            if s[i] in mapST:
                if mapST[s[i]] != t[i]:
                    return False
            else:
                mapST[s[i]] = t[i]

            # Check t -> s mapping
            if t[i] in mapTS:
                if mapTS[t[i]] != s[i]:
                    return False
            else:
                mapTS[t[i]] = s[i]

        return True