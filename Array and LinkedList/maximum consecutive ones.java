import java.util.ArrayList;

public class Solution {
    public static int longestSubSeg(ArrayList<Integer> arr, int n, int k) {
        int maxLength = 0;
		int zerocount =0;
		int j =0;
		for(int i =0;i<n;i++){
           if(arr.get(i) == 0){
			   zerocount++;
		   }
		   while(zerocount>k){
			  if (arr.get(j) == 0) {
                    zerocount--;
                }
			   j++;
		   }
		   maxLength = Math.max(i-j+1, maxLength);
		}
        return maxLength;
    }
}
