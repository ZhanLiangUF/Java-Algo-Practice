public class MinStack {
   Stack<Integer> stack = new Stack<>();
   private int MIN_VALUE = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
    }
    //normal push
    public void push(int x) {
        if (x <= MIN_VALUE) {
            stack.push(MIN_VALUE);
            MIN_VALUE = x;
        }
        stack.push(x);
    }
    //normal pop method
    public void pop() {
        if (stack.pop() == MIN_VALUE) {
            MIN_VALUE = stack.pop();
        }
    }
    //normal peek method
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return MIN_VALUE;
    }
}
