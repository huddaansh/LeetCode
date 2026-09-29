class Solution {
    public int minEatingSpeed(int[] piles, int h) { 
        int low = 1 ;
        int high = 0;
        for (int pile : piles ){
            high = Math.max(high , pile);
        }
        int mid = 0;

        while (low <= high){
            mid = low + (high - mid)/2;
            long count = 0;
            for (int j= 0 ; j < piles.length; j++){
                int n = piles[j]/mid;
                int m = piles[j]%mid;
                count = count + n;
                if (m!=0){
                    count ++;
                }

            }
            if (count <= h){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }

        
        }
        return low;
        
    }
}