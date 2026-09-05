class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int mn=Integer.MAX_VALUE;
        int suffix[]=new int[n];
        for(int i=n-1;i>=0;i--){
            mn=Math.min(mn,nums[i]);
            suffix[i]=mn;
        }
        int temp;
        System.out.println(Arrays.toString(suffix));
        for(int i=0;i<n;i++){
            mn=Math.max(mn,nums[i]);
            temp=mn-suffix[i];
            if(temp<=k){
                return i;
            }
        }
        return -1;
    }
}