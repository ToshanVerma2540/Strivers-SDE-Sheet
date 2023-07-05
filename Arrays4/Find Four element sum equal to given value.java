import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
    Arrays.sort(arr);
    for(int i =0;i<n-3;i++){
      for(int j =i+1;j<n-2;j++){
        int k = j+1;int h = n-1;
        while(k<h){
           if(arr[i]+arr[j]+arr[k]+arr[h] == target){
             return "Yes";
           }else if(arr[i]+arr[j]+arr[k]+arr[h] > target){
             h--;
           }else{
             k++;
           }
        }
      }
    }
    return "No";
  }
}
