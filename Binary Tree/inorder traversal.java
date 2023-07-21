import java.util.* ;

import javax.swing.tree.TreeNode;

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
    public static List < Integer > getInOrderTraversal(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
       inorderTraversal(root, ans);
       return ans;
    }
    public static void inorderTraversal(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }
      inorderTraversal(root.left,ans);
      ans.add(root.data);
      inorderTraversal(root.right, ans);
    }
}