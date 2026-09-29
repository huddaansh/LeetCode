class Solution(object):
    def minEatingSpeed(self, piles, h):
        """
        :type piles: List[int]
        :type h: int
        :rtype: int
        """
        low = 1
        high = max(piles)

        while (low < high):
            mid = low + (high - low)//2
            hours = sum(math.ceil(float(p) / mid) for p in piles)

            if hours <= h:
                high = mid 

            else:
                low = mid +1

        return low
                
        