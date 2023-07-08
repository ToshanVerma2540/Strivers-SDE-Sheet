import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        Comparator<int[]> comparator = Comparator.comparingInt(a -> a[1]);
        int max = 0;
        for(int i =0;i<jobs.length;i++){
            max = Math.max(jobs[i][0], max);
        }
        boolean a[] = new boolean[max+1];
        Arrays.sort(jobs, comparator);
        int profit =0;
        for(int i =jobs.length-1;i>=0;i--){
              if(a[jobs[i][0]]==false){
             profit = profit +jobs[i][1];
             a[jobs[i][0]] = true;
              }else{
                  int j = jobs[i][0];
                  while(j>0){
                      if(a[j]==false){
                           profit = profit +jobs[i][1];
                           a[j] = true;
                           break;
                      }else{
                          j--;
                      }
                  }
              }
        }
        return profit;
    }
}
