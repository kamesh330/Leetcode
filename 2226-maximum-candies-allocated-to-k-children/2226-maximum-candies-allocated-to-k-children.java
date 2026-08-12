class Solution {
    public boolean candies(int[] candies,int mid,long k){
        long sum=0;
        for(int n:candies){sum=sum+(n/mid);}
        return sum>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        // int left=1,right=1_00_000_00;
        // int ans=0;
        // // if(candies.length==1) return candies[0];
        // while(left<=right){
        //     int mid=(left+right)/2;
        //     if(candies(candies,mid,k)){
        //         ans=mid;
        //         left=mid+1;           
        //     }
        //     else{
        //         right=mid-1;
        //     }
        // }
        // return ans;\
        int left=1,right=1_00_000_000;
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(candies(candies,mid,k)){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;















    }
}