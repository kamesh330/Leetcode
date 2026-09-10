class Solution {
    public int[] dailyTemperatures(int[] tempers) {
        Stack<Integer> stack=new Stack<>();
        int arr[]=new int[tempers.length];
        for(int i=tempers.length-1;i>=0;i--){
            while(!stack.isEmpty()&&tempers[stack.peek()]<=tempers[i]){
                stack.pop();
            }
            if(!stack.empty())  {
                arr[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return arr;
    }
}