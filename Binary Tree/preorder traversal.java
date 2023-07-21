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
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	List<Integer> ans = new ArrayList<>();
		preorderTraversal(root,ans);
		return ans;
    }

	public static void preorderTraversal(TreeNode root,List<Integer> ans){

		if(root == null){
			return;
		}
		ans.add(root.data);
		preorderTraversal(root.left,ans);
		preorderTraversal(root.right,ans);
	}
}