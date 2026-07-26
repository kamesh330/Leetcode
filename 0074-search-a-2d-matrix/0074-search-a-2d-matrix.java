class Solution {
    boolean BinarySearch(int nums[],int target){
        int mid,left=0,right=nums.length-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
            return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target&&matrix[i][matrix[0].length-1] >=target){
               return  BinarySearch(matrix[i],target);
            }
        }
        return false;
    }
}