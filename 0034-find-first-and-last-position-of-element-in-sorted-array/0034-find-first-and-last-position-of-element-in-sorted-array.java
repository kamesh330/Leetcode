class Solution {
    public int  firstOccurance(int nums[],int target){
        int left=0,right=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[] {-1,-1};
       int start=firstOccurance(nums,target);
       if((start==nums.length)||(nums[start]!=target))  return new int[] {-1,-1};  
       
        return new int[]{start,firstOccurance(nums,target+1)-1};

    }
}