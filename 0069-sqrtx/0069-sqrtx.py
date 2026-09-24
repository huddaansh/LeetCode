class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        low = 0
        high = x
        while low <= high:
            if x < 2:
                return x

            mid = low + (high - low)//2

            if mid <= x/mid:
                low = mid +1

            else:
                high = mid -1 

        return high