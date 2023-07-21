import java.util.* ;
import java.io.*; 
public class Stack {

    // Define the data members.
 private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    
    public Stack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
           return queue1.size();
    }

    public boolean isEmpty() {
      return queue1.isEmpty();
    }

    public void push(int element) {
       queue2.add(element);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return queue1.remove();
        }
    }

    public int top() {
         if (isEmpty()) {
            return -1;
        } else {
            return queue1.peek();
        }
    }
}