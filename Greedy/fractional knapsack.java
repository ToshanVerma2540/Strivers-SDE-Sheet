import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Solution {
   public static double maximumValue(Pair[] items, int n, int w) {
        double ratio[] = new double[n];

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) items[i].value / items[i].weight;
            indices.add(i);
        }

        indices.sort(Comparator.comparingDouble((Integer a) -> ratio[a]).reversed());

        int currentWt = 0;
        double ans = 0;
        for (int i = 0; i < n; i++) {
			int index  = indices.get(i);
            if (currentWt + items[index].weight <= w) {
                ans = ans + items[index].value;
                currentWt = currentWt + items[index].weight;
            } else {
                double remaining = w - currentWt;
                remaining = (double) ((double) remaining / items[index].weight * items[index].value);
                ans = ans + remaining;
                break;
            }
        }
        return ans;
    }
}
