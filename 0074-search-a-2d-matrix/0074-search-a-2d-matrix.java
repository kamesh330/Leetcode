class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int mid, left = 0, right = (n*m)-1;
        while (left <= right) {
            mid = left + (right - left) / 2;

            int curr=matrix[mid/m][mid%m];

            if (curr == target) {
                return true;
            } else if (curr > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}