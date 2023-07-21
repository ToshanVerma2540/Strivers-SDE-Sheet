import java.util.* ;
import java.io.*; 
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
      Arrays.sort(positions);
       int low = 1;
       int high =Integer.MIN_VALUE;
       int min =Integer.MAX_VALUE;
       for(int e:positions){
           high = Math.max(high, e);
           min = Math.min(min,e);
       }
       high = high-min;
       int ans = Integer.MIN_VALUE;
       while(low<=high){
           int mid = low+(high-low)/2;
           if(canPlace(c,mid,positions)){
             ans = Math.max(ans, mid);
             low = mid+1;
           }else{
               high = mid-1;
           }
       }
       return ans;
    }

    public static boolean canPlace(int c, int mid, int[] positions) {
    int total = 1;
    int sum = 0;

    for (int i = 1; i < positions.length; i++) {
        sum += positions[i] - positions[i - 1];
        if (sum >= mid) {
            total++;
            sum = 0;
            if (total >= c) {
                return true;
            }
        }
    }

    return false;
}
}