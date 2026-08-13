class Solution {
    public boolean isValid(String L) {
        if(L.length()==1) return false;
       Stack<Character> s=new Stack<>();
       int top=0;
       for(char i:L.toCharArray()){
        if((i=='(')||(i=='[')||(i=='{')){
            s.push(i);
        }
        else{
            if(s.isEmpty()) return false;
             top=s.pop();
            if((i==')'&& top!='(')||(i=='}'&& top!='{')||(i==']'&& top!='[')){
                return false;
            }
        }
       }
       return (s.isEmpty())?true:false;
    
    }
}