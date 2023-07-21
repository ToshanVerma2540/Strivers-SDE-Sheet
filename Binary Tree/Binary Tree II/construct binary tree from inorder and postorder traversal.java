import java.util.HashMap;

/************************************************************
  
   Following is the TreeNode class structure
   
   class TreeNode<T> { 
        T data; 
        TreeNode<T> left;
        TreeNode<T> right;
  
        TreeNode(T data) { 
            this.data = data; 
            left = null; 
            right = null; 
        }
   }
    
 ************************************************************/

public class Solution {
	public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postOrder, int[] inOrder) {
	   HashMap<Integer,Integer> map = new HashMap<>();
     for(int i =0;i<inOrder.length;i++){
       map.put(inOrder[i],i);
     }
     i = inOrder.length-1;
     return helper(postOrder, inOrder, 0, inOrder.length-1, map);
	}
  static int i;
     public static TreeNode<Integer> helper(int postOrder[],int[]inOrder,int l,
     int h,HashMap<Integer,Integer> map){
      
       if(l>h){
         return null;
       }
       TreeNode<Integer> newnode = new TreeNode<>(postOrder[i]);
       int mid = map.get(postOrder[i]);
       i--;
       if(l==h){
         return newnode;
       }
       newnode.right = helper(postOrder, inOrder, mid+1, h, map);
       newnode.left = helper(postOrder, inOrder, l, mid-1, map);
       return newnode;
     }
}
