import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        int count =0;
        for(int i = arr.size()-1;i>=0;i--){
            for(int j =i-1;j>=0;j--){
                if(arr.get(j)>arr.get(i)){
                    long mul = 2*arr.get(i);
                    if(arr.get(j)>mul){
                        count = count+1;
                    }
                }
            }
        }
        return count;
    }
}