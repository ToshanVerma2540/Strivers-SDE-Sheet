import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }

    public static void helper(TreeNode root,List<Integer> ans){
       if(root == null){
           return;
       }
         helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.data);
    }
}