class Solution {
    public boolean palindrom(String s){
        int left=0,right=s.length()-1;
        boolean flag=false;
        while(left<right){
            if(!(s.charAt(left)==s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;

    }
    public String firstPalindrome(String[] words) {
        for(String a:words){
            if(palindrom(a)) return a;
        }
        return "";
    }
}