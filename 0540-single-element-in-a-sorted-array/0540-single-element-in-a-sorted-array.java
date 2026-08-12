class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int left = 0;
        // int right = nums.length - 1;
        // int ans = -1, mid = 0;
        // while (left <= right) {
        //     mid = left + (right - left) / 2;
        //     System.out.println("before ----->left="+left+" right="+right+" mid="+mid);

        //     if ((mid + 1 != nums.length && mid - 1 < -1) && (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])) {
        //         ans = mid;
        //         break;
        //     } else if (mid % 2 == 1) {
        //         ans = mid;
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }

        //     System.out.println("left="+left+" right="+right+" mid="+mid+"  ans");
        // }
        // return nums[ans];
        if(nums.length==1) return nums[0];
        int i=0;
        int j=nums.length-1;
        while(i+1<=j&&nums[i]==nums[i+1]) i=i+2;
        return nums[i];
    }
}