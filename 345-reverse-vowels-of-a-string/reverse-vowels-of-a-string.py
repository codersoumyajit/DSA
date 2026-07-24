class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ["a","e","i","o","u","A","E","I","O","U"]
        output = []
        for ch in s:
            if ch in vowels:
                output.append(ch)

        output.reverse()

        result = []
        index = 0

        for ch in s:
            if ch in vowels:
                result.append(output[index])
                index += 1
            else:
                result.append(ch)

        return "".join(result)

