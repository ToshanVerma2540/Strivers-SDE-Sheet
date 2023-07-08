import java.io.*;
import java.util.* ;

/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> dummy = new LinkedListNode<>(0);
           LinkedListNode<Integer> temp = dummy;
		   LinkedListNode<Integer> current = head;
		   while(current!=null){
			 LinkedListNode<Integer> newnode = new LinkedListNode<>(current.data);  
			   temp.next = newnode;
			   current = current.next;
			   temp = temp.next;
		   }
		   temp = dummy.next;
		   current = head;
		   while(current != null){
			   temp.random = current.random;
			   current = current.next;
			   temp = temp.next;
		   }
		   temp = dummy.next;
		   dummy.next = null;
		   return temp;
	}
}
