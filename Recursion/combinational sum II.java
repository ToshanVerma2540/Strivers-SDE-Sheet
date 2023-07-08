// import java.util.ArrayList;
// import java.util.Collections;

// public class Solution 
// {
    
//     public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target) {
//         if (arr == null || arr.isEmpty()) {
//             return new ArrayList<>();
//         }
        
//         Collections.sort(arr);
//         ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
//         ArrayList<Integer> current = new ArrayList<>();
//         backtrack(arr, target, 0, current, subsets);
//         return subsets;
//     }

  
//     public static void backtrack(ArrayList<Integer> nums, int target, int start, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> subsets) {
//         if (target == 0) {
//             subsets.add(new ArrayList<>(current)); // Found a valid subset
//             return;
//         }
        
//         for (int i = start; i < nums.size(); i++) {
//             if (i > start && nums.get(i) == nums.get(i-1)) {
//                 continue; // Skip duplicates to avoid duplicate subsets
//             }
            
//             if (nums.get(i) > target) {
//                 break; // Remaining elements are too large, no need to continue
//             }
            
//             current.add(nums.get(i));
//             backtrack(nums, target - nums.get(i), i + 1, current, subsets);
//             current.remove(current.size() - 1);
//         }
//     }
    
// }

import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target) {
        if (arr == null || arr.isEmpty()) {
            return new ArrayList<>();
        }
        
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        helper(arr, n, target, 0, 0, current, subsets);
        return subsets;
    }

    public static void helper(ArrayList<Integer> arr, int n, int k, int i, int sum,
            ArrayList<Integer> current, ArrayList<ArrayList<Integer>> subsets) {
        if (i == n){
        if (sum == k) {
            subsets.add(new ArrayList<>(current)); 
        }
         return;
        }
        // Include the current element in the subset
        current.add(arr.get(i));
        helper(arr, n, k, i + 1, sum + arr.get(i), current, subsets);
        current.remove(current.size() - 1); // Backtrack: remove the current element

        // Skip duplicates
        while (i + 1 < n && arr.get(i) == arr.get(i + 1)) {
            i++;
        }

        // Exclude the current element from the subset
        helper(arr, n, k, i + 1, sum, current, subsets);
    }
}