import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> predecessorSuccessor(TreeNode<Integer> root, int key) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeNode<Integer> predecessor = null;
        TreeNode<Integer> successor = null;

        // Perform iterative traversal to find predecessor and successor
        TreeNode<Integer> current = root;
        while (current != null) {
            if (current.data == key) {
                if (current.left != null) {
                    predecessor = findMaxValue(current.left);
                }
                if (current.right != null) {
                    successor = findMinValue(current.right);
                }
                break;
            } else if (current.data > key) {
                successor = current;
                current = current.left;
            } else {
                predecessor = current;
                current = current.right;
            }
        }

        if (predecessor != null) {
            result.add(predecessor.data);
        }
        if (successor != null) {
            result.add(successor.data);
        }

        return result;
    }

    private static TreeNode<Integer> findMaxValue(TreeNode<Integer> node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    private static TreeNode<Integer> findMinValue(TreeNode<Integer> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
