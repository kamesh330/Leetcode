class Solution {
    public String decodeString(String a) {
        Stack<String> s=new Stack<>(); 
        for(char i:a.toCharArray()){
            if(i!=']'){
                s.push(String.valueOf(i));
            }
            else{
                // while poping the untill we reach the [ 
                StringBuilder temp=new StringBuilder();
                while(!s.peek().equals("["))
                {  temp.insert(0,s.pop());
                }
                // removeing the [
                s.pop();
                StringBuilder num=new StringBuilder();
                while(!s.isEmpty()&&Character.isDigit(s.peek().charAt(0))){
                    num.insert(0,s.pop());
                    System.out.println(num.toString());
                }
                // StringBuilder rep=temp.toString().repeat(Integer.PareInt(num.toString()));
                String rep = temp.toString().repeat(Integer.parseInt(num.toString()));
                s.push(rep);
            }
        }
        StringBuilder result=new StringBuilder();
        for(String str:s) result.append(str);
        return result.toString();
    }
}