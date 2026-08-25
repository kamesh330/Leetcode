class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int c=k;
        while (set.contains(c)) {
            if (!set.contains(c))
                return c;
            c = k + c;
        }
        return c;
    }

}