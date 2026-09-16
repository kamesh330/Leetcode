class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<Integer>();
        for(int i:asteroids){
            if(i>0){
                stack.push(i);
            }
            else{
                while(!stack.empty()&&(stack.peek()>0&& stack.peek()<-i)) stack.pop();
                if(stack.isEmpty()||stack.peek()<0){
                    stack.push(i);
                }
                if(!stack.isEmpty()&&stack.peek()==-i){
                    stack.pop();
                }
            }
        }
        int arr[]=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            arr[i]=stack.peek();
            stack.pop();
        }
        return arr;
    }
}