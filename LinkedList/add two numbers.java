import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
            this.next =null;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
    return  addTwoNumbersHelper(head1,head2,0);
    }


    static LinkedListNode addTwoNumbersHelper(LinkedListNode node1, LinkedListNode node2, int carry)
    {
        if (node1 == null && node2 == null && carry == 0)
        {
            // Added both the lists and no carry is generated.
            return null;
        }

        // 'VAL1' and 'VAL2' store the data of the current nodes of the two linked lists.
        int val1, val2;

        // 'NEXT1' and 'NEXT2' point to the node present after the current nodes of the two linked lists.
        LinkedListNode next1, next2;

        if (node1 == null)
        {
            // List 1 is empty. So, consider the current node's value as zero.
            val1 = 0;
            // And the node after the current node as null.
            next1 = null;
        }
        else
        {
            val1 = node1.data;
            next1 = node1.next;
        }

        if (node2 == null)
        {
            // List 2 is empty. So, consider the current node's value as zero.
            val2 = 0;
            // And the node after the current node as null.
            next2 = null;
        }
        else
        {
            val2 = node2.data;
            next2 = node2.next;
        }

        // Add the values in the current nodes along with the carry.
        int sum = val1 + val2 + carry;

        // Create the next node of the sum list.
        LinkedListNode sumNode = new LinkedListNode(sum % 10);

        // Recursively call the function to generate the remaining nodes of the sum list.
        sumNode.next = addTwoNumbersHelper(next1, next2, sum / 10);

        return sumNode;
    }
}
