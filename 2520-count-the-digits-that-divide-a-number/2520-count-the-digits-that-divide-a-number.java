class Solution {
    public int countDigits(int num) {
       Set<Integer> set=new HashSet<>();
       int sum=num;
       int c=0;
       while(num>0){
        set.add(num%10);
        int temp=num%10;
        if( sum %temp==0) c++;
        num=num/10;
       }
        return c;
    }
}