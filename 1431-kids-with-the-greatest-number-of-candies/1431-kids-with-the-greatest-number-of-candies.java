class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        
        int maxCandies = 0;
        for(int i = 0; i < n ; i++){
            if (maxCandies <=  candies[i]){
                maxCandies = Math.max(candies[i], maxCandies);
            }
        }
        for (int i = 0; i < n;i++){
            

            if ((candies[i] + extraCandies) >= maxCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}