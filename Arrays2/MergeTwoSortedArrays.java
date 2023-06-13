import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
       int i =0;int j =0;
       while(i<m&&j<n){
           if(arr1[i]>arr2[j]){
              int temp = arr1[i];
              arr1[i] = arr2[j];
              arr2[j] = temp;
              sort(arr2);
              i++;
           }else{
               i++;
           }
       }
       int f =0;
       for(int k =m;k<arr1.length;k++){
           arr1[k] = arr2[f];
           f++;
       }
       return arr1;
    }

    public static void sort(int[] a){
        for(int i =0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
              int temp = a[i];
              a[i] = a[i+1];
              a[i+1] = temp;
            }else{
                break;
            }
        }
    }
}
