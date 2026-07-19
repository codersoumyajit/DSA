# class Solution:
#     def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
#         count = 0
#         for i in range(len(flowerbed)):
#             left = flowerbed[i-1]
#             current = flowerbed[i]
#             right = flowerbed[i+1]
#             if current == 0 and left == 0 and right == 0:
#                 flowerbed[i] = 1
#                 count += 1
#         if count >= n:
#             return true
#         else:
#             return false

class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        count = 0
        for i in range(len(flowerbed)):
            left_empty = (i==0) or (flowerbed[i-1] == 0)
            right_empty = (i == len(flowerbed) - 1) or (flowerbed[i+1] == 0)

            if flowerbed[i] == 0 and left_empty and right_empty:
                flowerbed[i] = 1
                count += 1
            if count >= n:
                return True
        return False
