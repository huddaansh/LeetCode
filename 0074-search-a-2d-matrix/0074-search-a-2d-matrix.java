class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length , cols = matrix[0].length;
        int low = 0 , high = (rows * cols) -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            int currentElement = matrix[mid/cols][mid%cols];
            if(currentElement ==  target){
                return true;
            }
            else if (currentElement < target ) {
                low = mid + 1;
                
            }
            else{
                high = mid -1;
            }

        }
        return false;
    }
}