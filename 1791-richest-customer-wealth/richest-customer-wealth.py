class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        maxsum = 0
        for i in range(len(accounts)):
            currentsum = sum(accounts[i])
            maxsum =  max(maxsum, currentsum)
        return maxsum