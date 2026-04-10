class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
		for(String s : tokens) {
			if("-".equals(s)) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b-a);
			} else if("+".equals(s)) {
				stack.push(stack.pop()+stack.pop());
			} else if("*".equals(s)) {
				stack.push(stack.pop()*stack.pop());
			} else if("/".equals(s)) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b/a);
			} else {
				stack.push(Integer.parseInt(s));
			}
		}
		return stack.pop();
    }
}
