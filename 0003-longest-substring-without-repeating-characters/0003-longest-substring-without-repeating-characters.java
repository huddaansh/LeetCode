class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, length = 0;

        HashMap<Character , Integer> indexMap = new HashMap<>();
        for(;end < s.length() ; end += 1){
            char currentChar = s.charAt(end);
            if(indexMap.containsKey(currentChar)) {
                start = Math.max(start, indexMap.get(currentChar) + 1);
            }
            length = Math.max(length, (end - start + 1));

            indexMap.put(currentChar,end);
            

        }
        return length;
        
    }
}