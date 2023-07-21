import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
      if(str1.length()!=str2.length()){
          return false;
      }
      Set<Character> set = new HashSet<>();
      for(int i =0;i<str1.length();i++){
          set.add(str1.charAt(i));
      }
      for(int i =0;i<str1.length();i++){
         if(!set.contains(str2.charAt(i))){
             return false;
         }
      }
      return true;

    }
}