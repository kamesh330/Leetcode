class Solution {
    public int missingInteger(int[] nums) {
        int sum=0,count=0;
        Set<Integer> set=new  HashSet<>();
        for(int i:nums){set.add(i);}
        int longestPre=nums[0];
       for(int i=1;i<nums.length;i++){
        if((nums[i]) ==nums[i-1]+1)    longestPre+=nums[i];
        else break;
       }
    
        while(set.contains(longestPre)) longestPre++;
        return longestPre;
    }
}