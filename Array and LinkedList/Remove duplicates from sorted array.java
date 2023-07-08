import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
	   if(n<=1){
		   return n;
	   }
	 HashSet<Integer> set = new HashSet<>();
	    for(int i =0;i<arr.size();i++){
			set.add(arr.get(i));
		}
		return set.size();
	}
}