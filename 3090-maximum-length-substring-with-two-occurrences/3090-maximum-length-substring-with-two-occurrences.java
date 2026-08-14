class Solution {
    public int maximumLengthSubstring(String a) {
       int max=Integer.MIN_VALUE;
        for(int i=0;i<=a.length();i++){
            for(int j=i;j<=a.length();j++){
            int fre[]=new int[26];        
                String s=a.substring(i,j);
                for(char k:s.toCharArray())  fre[k-'a']++;
                boolean flag=true;
                for(int k:fre)  {
                    if(!(k<=2)){
                        flag=false;
                    }
                }
                if(flag){
                    // String s=a.substring(i,j);
                    max=Math.max(max,s.length());
                    // System.out.println(s);
                        // System.out.println(Arrays.toString(fre));
                }
            }
        }
        return max;
    }
}