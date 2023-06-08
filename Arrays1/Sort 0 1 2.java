import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int zeros = 0;
        int ones = 0;int twos = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0){
                zeros++;
            }else if(arr[i] == 1){
                ones++;
            }else{
                twos++;
            }
        }
        for(int i =0;i<arr.length;i++){
            if(zeros>0){
                arr[i] = 0;
                zeros--;
            }else if(ones>0){
                arr[i] = 1;
                ones--;
            }else{
                arr[i] = 2;
                twos--;
            }
        }
       
    }
}