class Solution {
    public int maxProduct(int[] nums) {
        int secmax=Integer.MIN_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                secmax=max;
                max=nums[i];
            }
            if(nums[i]>secmax&&nums[i]!=max){
                secmax=nums[i];
            }
        }
        return (secmax-1)*(max-1);
    }
}