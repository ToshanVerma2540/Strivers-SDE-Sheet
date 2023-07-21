
public class Solution 
{
    public static int cutLogs(int k, int n) 
    {	
        // Create an array dp
        int[][] dp = new int[k + 1][n + 1];

        for (int i = 0; i <= k; i++) 
        {
            for (int j = 0; j <= n; j++) 
            {
                dp[i][j] = j;
            }
        }
		
        // Iterate i from 2 to K
        for (int i = 2; i <= k; i++) 
        {	
            // Iterate j from 2 to N
            for (int j = 2; j <= n; j++) 
            {
                for (int t = 1; t <= j; t++) 
                {
                    int cur = Math.max(dp[i - 1][t - 1], dp[i][j - t]);
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
                
                // Increment dp[i][j] by 1
                dp[i][j]++;
            }
        }
		
        // Return the element dp[k][n]
        return dp[k][n];
    }
}