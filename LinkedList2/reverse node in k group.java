import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/

public class Solution {

	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		 return reverse(head,n,b);
	}
     static Node reverse(Node head,int n,int b[]){
	    Node current = head;
		Node temp =new Node(0);
		   Node prev = null;Node next = null;
	   for(int i =0;i<n;i++){
           int count =1;
		   while(b[i] == 1&&current != null){
			   prev = current;
			   current = current.next;
		   } if(b[i] == 0){
			   continue;
		   }
		  while(current!=null&&count<b[i]){
             next = current.next;
			 current.next = prev;
			 prev = current;
			 current = next;
		  } 
		   temp.next = prev;
           if(next != null){
			   current = next;
		   }
	   }
	   return temp.next;
	}
}
