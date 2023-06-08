import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
	ArrayList<ArrayList<Long>> al = new ArrayList<>();
	
	    for(int i =0;i<n;i++){
			al.add(new ArrayList<Long>()); 
		}
		 if(n ==1){
		 	  al.get(0).add(1L);
		}else if(n ==2){
		 al.get(0).add(1L);al.get(1).add(1L);al.get(1).add(1L);
		}else{
			 al.get(0).add(1L);al.get(1).add(1L);al.get(1).add(1L);
	    for(int i =1;i<al.size()-1;i++){
			for(int j = 0;j<al.get(i).size()-1;j++){
				if(j ==0){
					al.get(i+1).add(1L);
				}
					int k =j+1;
					al.get(i+1).add((al.get(i).get(j)+al.get(i).get(k)));
					if(k ==al.get(i).size()-1){
						al.get(i+1).add(1L);
					}
				}
			}
		}
		return al;
	}
}
