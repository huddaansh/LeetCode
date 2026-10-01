class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int windowSum = 0;
        int minlength = Integer.MAX_VALUE;

        for (int end = 0;end<nums.length;end++){
            windowSum += nums[end];
            while(windowSum>= target){
                minlength = Math.min(minlength,end-start+1);
                windowSum -= nums[start];
                start += 1;

            }
        }
        return minlength == Integer.MAX_VALUE ? 0 :minlength;
        
    }
}