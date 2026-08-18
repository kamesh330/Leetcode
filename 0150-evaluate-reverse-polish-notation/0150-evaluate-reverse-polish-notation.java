class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String i : tokens) {
          if (Character.isDigit(i.charAt(0)) ||
    (i.charAt(0) == '-' && i.length() > 1)){
                stack.add(Integer.valueOf(i));
                //   System.out.println(stack);
            } else {
                // if(!(stack.size()<2))  break;
                int a ;
                int b;
                if (i.equals( "/")) {
                    a = stack.pop();
                    b = stack.pop();
                    // System.out.println(b/a);
                    stack.push(b / a);
                    // System.out.println(stack);
                    // System.out.println("-------------");
                } else if (i.equals( "-")) {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    // System.out.println(stack);

                } else if (i.equals( "*")) {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                    // System.out.println(stack);

                } else if (i.equals( "+")) {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                    // System.out.println(stack);

                }
            }
        }

    return stack.pop();
}}