import java.util.Stack;

public class Queue {
      private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    void enQueue(int val) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(val);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    int deQueue() {
    if (isEmpty()) {
            return -1;
        }
        return stack1.pop();
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack1.peek();
    }

    boolean isEmpty() {
         return stack1.isEmpty();
    }
}