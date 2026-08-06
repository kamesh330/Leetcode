class Solution {
    public int findPeakElement(int[] nums) {
        int mid=0,left=0,right=nums.length-1;
        while(left<right){
             mid=left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        // System.out.println(left+" "+right);
        return left;
    }
}