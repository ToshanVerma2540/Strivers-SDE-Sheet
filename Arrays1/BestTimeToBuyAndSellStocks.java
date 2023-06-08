import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
      int profit = 0;
      int min =prices.get(0);
      for(int i =1;i<prices.size();i++){
          if(min>prices.get(i)){
              min = prices.get(i);
          }else{
              profit = Math.max(profit,prices.get(i)-min);
          }
      }
      return profit;
    }
}