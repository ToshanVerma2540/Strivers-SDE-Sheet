import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
	 if(stack.size()==0){
		 return;
	 }
	   int ele = stack.pop();
	    sortStack(stack);
		insert(ele,stack);
	}

	public static void insert(int ele,Stack<Integer> stack){
		if(stack.size() == 0|| stack.peek()<= ele){
			stack.push(ele);
			return;
		}
		int top = stack.pop();
		insert(ele, stack);
		stack.push(top);
	}
}