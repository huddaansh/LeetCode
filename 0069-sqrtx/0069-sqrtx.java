class Solution {
    public int mySqrt(int x) {
        int low = 1, high = x;
        int mid = 0;
        while (low <= high){
            mid = low + (high -low)/2;
            if (mid <= x /mid){
                low = mid +1;
            }    
            else{
                high = mid -1;
            }
        }
        return high;
    }
}