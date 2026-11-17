class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> stack = new Stack<>();
        for(char ch : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() > ch){
                stack.pop();
                k -= 1;
            }
            stack.push(ch);
        }
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k -= 1;
        }
        StringBuilder result = new StringBuilder();
        for( int i = 0 ; i < stack.size(); i++){
            if(result.length() == 0 && stack.get(i) == '0' ) continue;
            result.append(stack.get(i));
        }
        
        return result.length() == 0 ? "0" : result.toString();
    }
}