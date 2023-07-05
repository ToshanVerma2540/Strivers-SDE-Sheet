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
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
       if(firstHead==null||secondHead==null){
           return -1;
       }
       int sizea = size(firstHead);
       int sizeb = size(secondHead);
       Node first = firstHead;Node second = secondHead;
       while(sizea <sizeb){
            second = second.next;
            sizeb--;
       }
       while(sizeb <sizea){
            first = first.next;
            sizea--;
       }
       while(second!=null&&first!=null){
           if(second==first){
               return second.data;
           }
           second =second.next;
           first = first.next;
       }
       return -1;
    }
    public static int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp !=null){
            temp =temp.next;count++;
        }
        return count;
    }
}