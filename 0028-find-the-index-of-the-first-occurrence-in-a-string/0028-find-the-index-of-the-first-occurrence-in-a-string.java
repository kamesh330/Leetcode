class Solution {
    public int strStr(String haystack, String needle) {
        int count=0;
        for(int i=0;i<haystack.length();i++){
        int j=0;
        int k=i;
            // System.out.println("->"+k+" "+j);
            while(k<haystack.length()&&j<needle.length()&&haystack.charAt(k)==needle.charAt(j))
            {
                k++ ;
                j++;
            }
            // System.out.println("whiele"+k+" "+j);
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}