class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        count1 = {}

        # Frequency of chars
        for i in range(len(chars)):
            count1[chars[i]] = count1.get(chars[i], 0) + 1

        answer = 0

        # Check every word
        for j in words:
            count2 = {}

            # Frequency of current word
            for k in range(len(j)):
                count2[j[k]] = count2.get(j[k], 0) + 1

            canForm = True

            # Compare frequencies
            for ch in count2:
                if count2[ch] > count1.get(ch, 0):
                    canForm = False
                    break

            if canForm:
                answer += len(j)

        return answer