import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		HashSet<Character> set = new HashSet<>();
		Queue<Character> q = new LinkedList<>();
		int count = 1;
          q.add(input.charAt(0));set.add(input.charAt(0));
		for(int i =1;i<input.length();i++){
             if(set.contains(input.charAt(i))){
				 while(!q.isEmpty()){
					 char c = q.poll();
					 if(!set.isEmpty()&&set.contains(c)){
						 set.remove(c);
					 }
					 if(c == input.charAt(i)){
						 break;
					 }
				 }
			 }
			 q.add(input.charAt(i));set.add(input.charAt(i));
			 count = Math.max(count, q.size());
		}
		return count;
	}
}
