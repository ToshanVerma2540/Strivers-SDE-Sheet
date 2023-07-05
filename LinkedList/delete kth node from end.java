/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        if(head == null){
            return head;
        }
      int size = size(head);
      Node temp = head;
      int count = 1;
      if(size==K){
          return head.next;
      }
      while(count<=size-K){
         
          if(count == size-K){
              temp.next = temp.next.next;
             // temp.next.next = null;
          }
           count++;
          temp = temp.next;
      }
      return head;
    }

    public static int size(Node head){
        if(head == null){
            return 0;
        }
        Node temp  = head;
        int count =0;
         while(temp != null){
             temp = temp.next;
             count++;
         }
         return count;
    }
}