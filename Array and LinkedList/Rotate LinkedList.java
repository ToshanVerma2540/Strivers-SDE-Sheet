/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        int size = size(head);
         k = k%size;
         if(head == null||head.next == null||k==0){
             return head;
         }
         
         Node temp = head;
         Node temp2 = head;int count =1;
         while(temp.next !=null){
            temp = temp.next;
            if(count<size-k){
               temp2 = temp2.next;
            }
            count++;
         }
         Node result = temp2.next;
         temp2.next = null;
         temp.next = head;
         return result;
    }
    public static int size(Node head){
        if(head == null){
            return 0;
        }
        Node temp = head;
        int count =0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}