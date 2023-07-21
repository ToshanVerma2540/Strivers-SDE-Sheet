import java.util.* ;
import java.io.*; 
public class Solution {
    public static int atoi(String str) {
       if(str.length() == 0){
           return 0;
       }
       int ans = 0;
       boolean isNeg = false;
       int i =0;
       if(str.charAt(i) == '-'){
        isNeg = true;
        i++;
       }

       for(;i<str.length();i++){
           if(Character.isDigit(str.charAt(i))){
               ans = (ans%10)* Character.getNumericValue(str.charAt(0));
           }
       }
       if(isNeg){
           return -ans;
       }
       return ans;
    }
}
