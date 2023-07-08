import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
       int a[] = {1,2,5,10,20,50,100,500,1000};
       int count =0;
       for(int i=a.length-1;i>=0;i--){
          while(amount>=a[i]){
              count = count+amount/a[i];
              amount = amount%a[i];
          }
       }
       return count;
    }
}
