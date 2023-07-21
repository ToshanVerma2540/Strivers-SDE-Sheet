import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
      ArrayList<Integer> ans = new ArrayList<>();
      Stack<Integer> s = new Stack<>();
      for(int i = 0;i<n;i++){
          ans.add(-1);
      }
      for(int i =0;i<n;i++){
          if(s.isEmpty()||!s.isEmpty()&&arr.get(s.peek())<=arr.get(i)){
              s.push(i);
          }else{
              while(!s.isEmpty()&&arr.get(s.peek())>arr.get(i)){
                  ans.set(s.pop(),arr.get(i));
              }
              s.push(i);
          }
      }
    //   while(!s.isEmpty()){
    //       ans.set(s.pop(), -1);
    //   }
      return ans;
    }
}