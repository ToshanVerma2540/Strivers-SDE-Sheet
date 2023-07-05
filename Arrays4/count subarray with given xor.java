import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		 HashMap<Integer,Integer> map = new HashMap<>();
		 map.put(0,1);int xor = 0;
		 int count =0;
          for(int i =0;i<arr.size();i++){
               xor = xor^arr.get(i);
			   if(map.containsKey(xor^x)){
				   count = count+map.get(xor^x);
				  }
				  if(map.containsKey(xor)){
					  map.put(xor,map.get(xor)+1);
				  }
				  else{
				   map.put(xor,1);
			   }
		  }
		return count;
	}
}