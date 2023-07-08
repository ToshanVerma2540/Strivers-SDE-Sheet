import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        helper(arr, n, k, 0, 0, current, subsets);
        return subsets;
    }

    public static void helper(ArrayList<Integer> arr, int n, int k, int i, int sum,
            ArrayList<Integer> current, ArrayList<ArrayList<Integer>> subsets) {
        if (i == n) {
            if (sum == k) {
                subsets.add(new ArrayList<>(current));
            }
            return;
        }

        // Include the current element in the subset
        current.add(arr.get(i));
        helper(arr, n, k, i + 1, sum + arr.get(i), current, subsets);
        current.remove(current.size() - 1); // Backtrack: remove the current element

        // Exclude the current element from the subset
        helper(arr, n, k, i + 1, sum, current, subsets);
    }
}