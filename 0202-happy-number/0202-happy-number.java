class Solution {
   public  int sum(int n){
        int sum=0;
        while(n>0){
            sum=sum+(n%10)*(n%10);
            n=n/10;
        }
        return sum;
   }
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        int temp;
        // boolean flag=true;
        while(!set.contains(n)){
            set.add(n);
            temp=sum(n);
            if(temp==1) {
                return true;
            }
            System.out.println(" temp"+temp+"sum"+n);
            n=temp;

        }
        return false;
    }
}