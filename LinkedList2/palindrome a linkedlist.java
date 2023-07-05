import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return true;
        }

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedListNode<Integer> secondHalf = reverseLinkedList(slow.next);

        LinkedListNode<Integer> p1 = head;
        LinkedListNode<Integer> p2 = secondHalf;

        while (p2 != null) {
            if (p1.data != p2.data) {
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    private static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;

        while (curr != null) {
            LinkedListNode<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}