import java.util.ArrayList;
import java.util.Stack;

public class Solution {
  public static int largestRectangle(ArrayList<Integer> heights) {
    if (heights == null || heights.isEmpty()) {
      return 0;
    }
    
    int n = heights.size();
    int[] left = new int[n];
    int[] right = new int[n];
    
    // Calculate the nearest smaller element on the left side
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && heights.get(stack.peek()) >= heights.get(i)) {
        stack.pop();
      }
      left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
      stack.push(i);
    }
    
    // Clear the stack for the next iteration
    stack.clear();
    
    // Calculate the nearest smaller element on the right side
    for (int i = n - 1; i >= 0; i--) {
      while (!stack.isEmpty() && heights.get(stack.peek()) >= heights.get(i)) {
        stack.pop();
      }
      right[i] = stack.isEmpty() ? n - 1 : stack.peek() - 1;
      stack.push(i);
    }
    
    // Find the maximum area
    int maxArea = 0;
    for (int i = 0; i < n; i++) {
      int area = heights.get(i) * (right[i] - left[i] + 1);
      maxArea = Math.max(maxArea, area);
    }
    
    return maxArea;
  }
}
