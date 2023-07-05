import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
       int count = 0;long sum =0;
	      for(int i =0;i<arr.size();i++){
			  sum = 0;
			for(int j = i;j<arr.size();j++){
				sum = sum+arr.get(j);
				if(sum == 0){
				count = Math.max(count,(j+1)-i);
			}
			}
		}
		return count;
	}
}