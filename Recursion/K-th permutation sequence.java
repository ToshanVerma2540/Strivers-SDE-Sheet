import java.util.ArrayList;

public class Solution {
    public static String kthPermutation(int n, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        int fac = 1;
        for(int i =1;i<n;i++){
            fac = fac*i;
            nums.add(i);
        }
         nums.add(n);
         k--;String ans="";
         while(true){
             ans = ans+nums.get(k/fac);
             nums.remove(k/fac);
             if(nums.size()==0){
                 break;
             }
             k = k%fac;
             fac = fac/nums.size();
         }
         return ans;
    }

}