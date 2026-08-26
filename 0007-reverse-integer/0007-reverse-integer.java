class Solution {
    public int reverse(int x) {
        long rev=0;
        long num=(x>0)?x:-x;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev>Integer.MAX_VALUE) return 0;
        return (x>0)?(int)rev:(int)-rev;
    }
}