class Solution {
   
    public int firstOccurance(int[] nums,int target){
         int mid=0,left=0,right=nums.length-1;
         int ans=-1;
        while(left<=right){
           mid=(left+right)/2;
           if(nums[mid]==target){
            ans=mid;
            right=mid-1;
            // left=mid+1;
           }
           else if(nums[mid]<target){
            // ans=nums[mid];
            left=mid+1;
           }
           else{
            right=mid-1;
           }
        }
        return ans;
    }

    public int lastOccurance(int[] nums,int target){
          int mid=0,left=0,right=nums.length-1;
          int ans=-1;
        while(left<=right){
           mid=(left+right)/2;
           if(nums[mid]==target){
            ans=mid;
            left=mid+1;
           }
           else if(nums[mid]<target){
            left=mid+1;
           }
           else{
            // ans=nums[mid];
            right=mid-1;
           }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurance(nums,target),lastOccurance(nums,target)};
    }
}