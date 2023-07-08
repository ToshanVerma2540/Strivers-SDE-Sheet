import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<List<String>> partition(String s) {
      List<List<String>> ans = new ArrayList<>();
      List<String> small = new ArrayList<>();
      helper(s, small, ans);
      return ans;
    }

    public static void helper(String s,List<String> small,List<List<String>> big){
       if(s.length()<=0){
           big.add(new ArrayList<>(small));
           return;
       }
       for(int i =0;i<s.length();i++){
           String palindromePart = s.substring(0,i+1);
           if(isPalindrome(palindromePart)){
                String remainString = s.substring(i+1);
                small.add(palindromePart);
               helper(remainString,small,big);
               small.remove(small.size()-1);
           }
       }
    }

    public static boolean isPalindrome(String s){
        int i =0;int h = s.length()-1;
        while(i<h){
            if(s.charAt(i) != s.charAt(h)){
                return false;
            }
            i++;h--;
        }
        return true;
    }
}