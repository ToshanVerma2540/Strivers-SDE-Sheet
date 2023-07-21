import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		ArrayList<Integer> current = new ArrayList<>();
		solve(arr,res,current,0);
		return res;
	}

	public static void solve(ArrayList<Integer> arr, 
	 ArrayList<ArrayList<Integer>>res,ArrayList<Integer> current,int i){
        if(i == arr.size()){
			res.add(new ArrayList<>(current));
			return;
		}
		solve(arr,res,current,i+1);
		current.add(arr.get(i));
		solve(arr,res,current,i+1);
		current.remove(current.size()-1);
	}
}

