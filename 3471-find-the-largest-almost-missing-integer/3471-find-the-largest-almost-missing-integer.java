class Solution {
    public int largestInteger(int[] nums, int k) {
        int max=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            System.out.println(set);
            for(int num:set)  map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> pair:map.entrySet()){
            if(pair.getValue()==1){
                max=Math.max(max,pair.getKey());
            }
        }
        return max;
    }
}