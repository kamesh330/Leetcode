class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x<=3) return 1;
        int mid=0,left=1,right=x;
        int ans=1;
        while(left<right){
            mid=left+(right-left)/2;
            if((x/mid)<mid){
                right=mid;
            }
            else{
                ans=mid;
                left=mid+1;
            }
        }
        System.out.println(left+" "+right);
        return ans;
    }
}