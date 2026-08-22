class Solution {
    public boolean isPowerOfTwo(int n) {
        long mid=0,left=0,right=31;
        // System.out.println(Math.pow(2,31)+" "+Integer.MAX_VALUE);
        
        while(left<=right){
            mid=(left+right)/2;
            if(Math.pow(2,mid)==n){
                return true;
            }
            else if(Math.pow(2,mid) > n){
                right=mid-1;   
            }
            else {
                left=mid+1;
            }
        }

        return false;
    }
}