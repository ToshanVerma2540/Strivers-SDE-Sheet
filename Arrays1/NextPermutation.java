import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int a = -1;
		for(int i = permutation.size()-2;i>=0;i--){
                 if(permutation.get(i+1)>permutation.get(i)){
					 a = i;
					 break;
				 }
		}
		int b = -1;
		if(a !=-1){
           for(int i =permutation.size()-1;i>=0;i--){
			   if(permutation.get(i)>permutation.get(a)){
				   b = i;
				   break;
			   }
		   }
		}
		if(a!=-1&&b!=-1){
			int temp = permutation.get(a);
			int k =permutation.get(b);
			permutation.set(a,k); 
			permutation.set(b,temp);
			int l = a+1;
			int h = permutation.size()-1;
			while(l<h){
				 temp = permutation.get(l);
				k = permutation.get(h);
			permutation.set(l,k); 
			permutation.set(h,temp);
			l++;h--;
			} 
		}else{
			int l = 0;
			int h = permutation.size()-1;
			while(l<h){
				int temp = permutation.get(l);
				int k = permutation.get(h);
			permutation.set(l,k); 
			permutation.set(h,temp);
			l++;h--;
			} 
		}
		return permutation;
	}
}