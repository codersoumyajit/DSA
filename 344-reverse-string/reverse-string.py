class Solution:
    def reverseString(self, s: List[str]) -> None:
        output = []
        for i in range(len(s)-1, -1, -1):
            output.append(s[i])
        for i in range(len(s)):
            s[i] = output[i]
        