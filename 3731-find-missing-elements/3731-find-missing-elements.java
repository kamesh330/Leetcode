class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(i>max){
                max=i;
            }
            if(min>i){
                min=i;
            }
            set.add(i);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) res.add(i);
        }

        return res;
    }
}