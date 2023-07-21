import java.util.* ;
import java.io.*; 
public class Queue {
     private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    Queue() {
        maxSize = 5000;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }
    boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    void enqueue(int data) {
      if (isEmpty()) {
            front = 0;
            rear = 0;
            queueArray[rear] = data;
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = data;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            return -1;
        } else if (front == rear) {
            int dequeuedElement = queueArray[front];
            front = -1;
            rear = -1;
            return dequeuedElement;
        } else {
            int dequeuedElement = queueArray[front];
            front = (front + 1) % maxSize;
            return dequeuedElement;
        }
    }

    int front() {
       if (isEmpty()) {
            return -1;
        } else {
            return queueArray[front];
        }
    }

}
