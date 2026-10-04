class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for (int pile : piles){
            high = Math.max(high , pile);
        }
        int count = 0;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (isValid(piles, h , mid)){
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
        }    
        return low;
         
    }
    
    private boolean isValid(int[] piles ,int h , int speed){
        long numberhours = 0;
        for(int pile : piles){
            if(pile % speed == 0){
                numberhours += (pile / speed);
            }
            else{
                numberhours += (pile/speed) + 1;
            }

        }
        return numberhours <= h;
    }
}