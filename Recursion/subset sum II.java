import java.util.* ;
import java.io.*; 
public class Solution {
   public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr); 
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        generateSubsets(arr, 0, new ArrayList<>(), subsets);
        return subsets;
    }
    
    private static void generateSubsets(int arr[], int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> subsets) {
        subsets.add(new ArrayList<>(current)); 
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            
            current.add(arr[i]); 
            generateSubsets(arr, i + 1, current, subsets); 
            current.remove(current.size() - 1); 
        }
    }
}