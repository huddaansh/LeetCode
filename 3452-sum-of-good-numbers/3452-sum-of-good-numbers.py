class Solution(object):
    def sumOfGoodNumbers(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
       
        total = 0

        for i in range(len(nums)):
            if (i-k < 0 or nums[i] > nums[i-k]) and \
               (i+k >= len(nums) or nums[i] > nums[i+k]):
                total += nums[i]

        return total