class Solution {
    public char nextGreatestLetter(char[] nums, char target) {
        int mid=0,left=0,right=nums.length-1;
        char ans=nums[0];
        while(left<=right){
           mid=(left+right)/2;
           if(nums[mid]==target){
            // ans=nums[mid];
            // break;
            left=mid+1;
           }
           else if(nums[mid]<target){
            left=mid+1;
           }
           else{
            ans=nums[mid];
            right=mid-1;
           }
        }
        return ans;
    }
}