class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:

        morse = [
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        ]

        seen = set()

        for word in words:
            code = ""

            for ch in word:
                index = ord(ch) - ord('a')
                code += morse[index]

            seen.add(code)

        return len(seen)