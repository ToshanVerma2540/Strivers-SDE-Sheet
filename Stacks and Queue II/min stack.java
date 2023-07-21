import java.util.* ;
import java.io.*; 

public class Solution {

    static class MinStack {

        private Stack<Integer> stack; // Stack to store the elements
        private Stack<Integer> minStack; // Stack to store the minimum values

        // Constructor
        MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
              stack.push(num); // Add the element to the main stack

            if (minStack.isEmpty() || num <= minStack.peek()) {
                minStack.push(num); // If the element is smaller or equal to the current minimum, add it to the minStack
            }
        }

        // Function to remove the top element of the stack.
        int pop() {
             if (stack.isEmpty()) {
                 return -1;
            }

            int num = stack.pop(); // Remove the top element from the main stack

            if (num == minStack.peek()) {
                minStack.pop(); // If the removed element is the current minimum, remove it from the minStack
            }

            return num;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
         if (stack.isEmpty()) {
             return -1;
            }

            return stack.peek();
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
           if (minStack.isEmpty()) {
               return -1;
            }

            return minStack.peek(); 
        }
    }
}