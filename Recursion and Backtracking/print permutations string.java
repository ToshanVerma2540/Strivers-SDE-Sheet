import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<String> findPermutations(String s) {
      List<String> ans = new ArrayList<>();
        findPermutation(s,ans,"");
        return ans;
    }

    public static void findPermutation(String s,List<String> ans,String permutation){
        if(s.length()==0){
          ans.add(permutation);
          return;
        }

        for(int i =0;i<s.length();i++){
             String remaining = s.substring(0,i)+s.substring(i+1);
              findPermutation(remaining,ans,permutation+s.charAt(i));
        }
    }
}