import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        if (first == null) {
            return second;
        }

        if (second == null) {
            return first;
        }

        LinkedListNode<Integer> dummy = new LinkedListNode<>(0);;
        LinkedListNode<Integer> temp =dummy;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }

        if (first != null) {
            temp.next = first;
        } else if (second != null) {
            temp.next = second;
        }

        return dummy.next;
    }
}

