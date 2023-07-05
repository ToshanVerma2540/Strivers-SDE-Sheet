import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        for(int e:arr){
            set.add(e);
        }
        int maxcount = 0;
        int count =0;
       for(int i =0;i<arr.length;i++){
          count = 1;
          int ele = arr[i];
          if(!set.contains(ele-1)){
          while(set.contains((ele+1))){
              ele = ele+1;
              count++;
          }
          }
          maxcount = Math.max(count, maxcount);
       }
       return maxcount;
    }
}