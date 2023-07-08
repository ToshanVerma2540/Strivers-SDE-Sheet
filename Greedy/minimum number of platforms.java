import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
       Arrays.sort(at); Arrays.sort(dt);
      int j =0;
      int maximum = 1;int count = 1;
      int i = 1;
      while(i<n&&j<n){
          if(dt[j]>=at[i]){
              count++;
              i++;
          }else if(dt[j]<at[i]){
              count--;
              j++;
          }
          maximum = Math.max(count,maximum);
      }
      return maximum;
    }
}