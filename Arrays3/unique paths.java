import java.util.* ;
import java.io.*; 
public class Solution {

	public static int solve(int m,int n,int i,int j,int dp[][]){
		  if(i==(m-1)&&j==(n-1)){
			  return 1;
		  }
		  if(i>=m||j>=n){
			  return 0;
		  }
		  if(dp[i][j]!=0){
			  return dp[i][j];
		  }
		int a =  solve(m,n,i+1, j,dp);
		 int b =  solve(m,n,i, j+1,dp);
		 dp[i][j] = a+b;
		 return a+b;
	}
	public static int uniquePaths(int m, int n) {
	 if(m==1||n==1){
		 return 1;
	 }
	   int dp[][] = new int[m][n];
	      solve(m,n,0,0,dp);
		  return dp[0][0];
	}
}