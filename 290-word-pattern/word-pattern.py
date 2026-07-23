class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        # Number of pattern characters and words must be same
        if len(pattern) != len(words):
            return False

        mapPW = {}  # Pattern -> Word
        mapWP = {}  # Word -> Pattern

        for i in range(len(pattern)):

            p = pattern[i]
            w = words[i]

            # Check Pattern -> Word mapping
            if p in mapPW:
                if mapPW[p] != w:
                    return False
            else:
                mapPW[p] = w

            # Check Word -> Pattern mapping
            if w in mapWP:
                if mapWP[w] != p:
                    return False
            else:
                mapWP[w] = p

        return True