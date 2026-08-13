class Solution {
    public boolean koko(int nums[], int mid, int h) {
        long sum = 0;
        for (int i : nums) {
            sum += (i / mid);
            if (i % mid != 0)
                sum++;
        }
        return sum <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1000000000;
        int mid = 0, ans = right;
        while (left <= right) {
            mid = (left + right) / 2;
            if (koko(piles, mid, h)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}