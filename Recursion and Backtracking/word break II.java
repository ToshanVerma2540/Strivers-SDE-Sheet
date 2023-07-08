import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		HashSet<String> set = new HashSet<>();
		for(String e:dictionary){
			set.add(e);
		}
		ArrayList<String> ans = new ArrayList<>();
		breakword(s,set,"",ans);
		return ans;
	}

	
	public static void breakword(String s,Set<String> set,String ans,ArrayList<String> al) {
		if(s.length()==0) {
		      al.add(ans);
			return;
		}
		
		for(int i =0;i<s.length();i++) {
			String roq = s.substring(i+1);
			String comp = s.substring(0,i+1);
			if(set.contains(comp)) {
				breakword(roq,set,ans+comp+" ",al);
			}
		}
	}
}