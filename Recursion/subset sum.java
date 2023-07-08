import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
       al = new ArrayList<>();
        subsetSumHelper(num,0,0);
        Collections.sort(al);
        return al;
    }
 
 static ArrayList<Integer> al;
 public static void subsetSumHelper(int num[],int i,int sum){
         if(i == num.length-1){
             al.add(sum);
             return;
         }
       subsetSumHelper(num,i+1,sum+num[i]);
        subsetSumHelper(num,i+1,sum);
 }
}