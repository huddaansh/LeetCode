class Solution {
    public String decodeString(String s) {

        Stack<StringBuilder> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        int num = 0;
        StringBuilder current = new StringBuilder();

        for( char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            } else if(ch == '['){
                numStack.push(num);
                stringStack.push(current);
                num = 0;
                current = new StringBuilder();

            }else if (ch == ']'){
                int count = numStack.pop();
                StringBuilder previousString = stringStack.pop();
                for(int i = 0; i < count; i++){
                    previousString.append(current);
                }
                current = previousString;
            }else{
                current.append(ch);
            }
        }
        return current.toString();
        
    }
}