import java.util.* ;
import java.io.*; 

public class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

      public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    void push(int num) {
         top++;
         stackArray[top] = num;
    }
    int pop() {
      if (top == -1) {
           // System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top];
            top--;
            return poppedElement;
        }
    }
    int top() {
         if (top == -1) {
            //System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    int isEmpty() {
       if(top == -1){
           return 1;
       }else{
           return 0;
       }
    }
    int isFull() {
      if(top == maxSize){
          return 1;
      }
      return 0;
    }
}
