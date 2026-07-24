class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        count = {}

        # Count first word
        for ch in words[0]:
            count[ch] = count.get(ch, 0) + 1

        # Compare with remaining words
        for word in words[1:]:
            current = {}

            for ch in word:
                current[ch] = current.get(ch, 0) + 1

            for ch in count:
                count[ch] = min(count[ch], current.get(ch, 0))

        # Build result
        result = []

        for ch in count:
            for i in range(count[ch]):
                result.append(ch)

        return result