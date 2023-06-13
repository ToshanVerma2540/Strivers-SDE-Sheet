import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
      Set<Integer> set = new HashSet<>();
      for(int e:arr){
          if(set.contains(e)){
              return e;
          }
         set.add(e);
      }
      return -1;
    }
}
