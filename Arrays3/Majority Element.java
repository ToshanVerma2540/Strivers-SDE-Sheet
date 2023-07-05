import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
	     if(n==1){
			 return arr[0];
		 }
		 int count = 1;int index = 0;
		 for(int i =1;i<n;i++){
			 if(arr[i] == arr[index]){
				 count++;
			 }else{
				 count--;
			 }
			 if(count<=0){
				 count =1;
				 index = i;
			 }
		 } 
       
	   count = 0;
	   for(int i =0;i<n;i++){
		   if(arr[i] == arr[index]){
			   count++;
		   }
	   }
	   if(count >(n/2)){
		   return arr[index];
	   }else{
		   return -1;
	   }
	}
}