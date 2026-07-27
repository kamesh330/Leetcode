class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set=new HashSet<>();
       for(int i:nums) set.add(i);
    int maxCount=0,curr=0;
        for(int i:set){
            if(!set.contains(i-1)){
                curr=0;
                int temp=i;
                while(set.contains(temp)){
                    temp++;
                    curr++;
                    // count++;
                }
                maxCount=Math.max(maxCount,curr);
            }
        }
        return maxCount;

    }
}