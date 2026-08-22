class Solution {
    public boolean checkDivisibility(int n) {
        int OriginalValue=n;
        int sum=0,product=1;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n=n/10;
        }
        // System.out.println(OriginalValue+" "+sum+" "+product+" "+(OriginalValue%sum==0));
        return (OriginalValue%(sum+product)==0)?true: false;
    }
}