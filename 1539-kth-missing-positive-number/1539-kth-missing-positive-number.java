class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            // find how many numbers are missing before the mid 
            int missing = arr[mid] - (mid + 1);
            if (k > missing){
                low = mid + 1;
            }
            else {
                high = mid -1 ;
            }
            
        }
        return (k + low);
        
    }
}