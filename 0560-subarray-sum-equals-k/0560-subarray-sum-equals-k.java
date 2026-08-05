class Solution {
    public int subarraySum(int[] nums, int k) {
        int p=0;
        int n=nums.length;
        int count=0;
        if(n==0) return 1;
        Map<Integer,Integer> a=new HashMap<>();
        a.put(0,1);
        for(int i=0;i<n;i++){
            p+=nums[i];
            int diff=p-k;
            if(a.containsKey(diff)){
                count+=a.get(diff);
            }
            a.put(p,a.getOrDefault(p,0)+1);
        }
        return count;
    }
}