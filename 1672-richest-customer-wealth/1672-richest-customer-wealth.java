class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;

        for (int[] customer : accounts){
            int wealth = 0;
            for (int money : customer){
                wealth += money;
            
            }
            if (wealth > maxwealth){
                maxwealth = wealth;
            }

        }
        
        return maxwealth;
    }
}