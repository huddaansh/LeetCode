class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int totalRemovals = nums.length - k;
        for(int num : nums){
            while(!stack.isEmpty() && totalRemovals > 0 && stack.peek() > num){
                stack.pop();
                totalRemovals -= 1;
            }

            stack.push(num);

        }

        while(!stack.isEmpty() && totalRemovals > 0 ){
            stack.pop();
            totalRemovals -= 1;
        }
        int[] result = new int[k];
        for (int i = 0; i < stack.size(); i ++){
            result[i] = stack.get(i);
        }
        return result;
        
    }
}