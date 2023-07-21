import java.util.*;
import java.io.*;

public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]) {
       int dp[][] = new int[n][k+1];
        int ans = helper(arr, k, 0,dp);
        return ans == 1;
    }

    public static int helper(int arr[], int k, int i,int dp[][]) {
        if (k == 0) {
            return 1;
        }
        if (i == arr.length || k < 0) {
            return -1;
        }
        if(dp[i][k] != 0){
            return dp[i][k];
        }
       int left  = helper(arr, k - arr[i], i + 1,dp);
       dp[i][k] = left;
       if(left == 1){
           return 1;
       }
       int right =  helper(arr, k, i + 1,dp);
          dp[i][k] = right;
          if(right ==1){
              return 1;
          }

        return -1;
    }
}
