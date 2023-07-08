import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
       if (n <= 2) {
            return 0;
        }
        
        long water = 0;
        
        long[] leftMax = new long[n];
        long[] rightMax = new long[n];
        
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        
        for (int i = 1; i < n - 1; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        
        return water;
    }
}
