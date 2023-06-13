import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
         Set<Integer> set = new HashSet<>();
         int repeatingNum = 0;int missing = 0;
         for(int e:arr){
           if(set.contains(e)){
            repeatingNum = e;
           }
           set.add(e);
         }
         for(int i =1;i<=arr.size();i++){
            if(!set.contains(i)){
                missing = i;
            }
         }
         int a[] = {missing,repeatingNum};
         return a;
    }
}