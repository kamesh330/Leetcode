class Solution {
    public int findDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                while(nums[i]!=i+1)  {
                    int temp=nums[i];
                    if(nums[i]==nums[temp-1]) return nums[i];
                    nums[i]= nums[temp-1];
                    nums[temp-1]=temp;
                }
            }
        }
        return -1;
    }
}