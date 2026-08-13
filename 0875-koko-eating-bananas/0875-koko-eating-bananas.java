class Solution {
    public boolean koko(int nums[],int mid,int h){
        long sum=0,d=0;
        for(int i:nums){
            sum+=(i/mid);
            if(i%mid!=0) sum++;
        }
        System.out.println(sum);
        return sum>h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=1000_000_000;
        int ans=-1,mid=0;
        while(left<=right){
         mid=(left+right)/2;
        System.out.println("left="+left+" right="+right +" ans"+ans);

        if(koko(piles,mid,h)){
            ans=mid;
            // right=mid-1;
            left=mid+1;
        }
        else{
            // ans=mid;
            // left=mid+1;
            right=mid-1;

        }
        System.out.println("------->left="+left+" right="+right +" ans"+ans);

        }
        System.out.println("left="+left+" right="+right +" ");
        return left;
    }
}