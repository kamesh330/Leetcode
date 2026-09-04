class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int suffix[]=new int[n];
        int mn=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            mn=Math.min(mn,nums[i]);
            suffix[i]=mn;
        }
        int temp;
        for(int i=0;i<n;i++){
            mn=Math.max(nums[i],mn);
            temp=mn-suffix[i];
            if(temp<=k){
                return i;
            }
        }
        return -1;

    }
}