import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
       List<Integer> indices = new ArrayList<>();
       
        for (int i = 0; i < start.size(); i++) {
            indices.add(i);
        }

        indices.sort((a, b) -> Integer.compare(end.get(a), end.get(b)));
         int prevEnd = end.get(indices.get(0));
         int ans = 1;
        for(int i =1;i<indices.size();i++){
            if(start.get(indices.get(i))>=prevEnd){
                ans++;
                prevEnd = end.get(indices.get(i));
            }
        }
       return ans;
    }
}