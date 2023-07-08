import java.util.* ;
import java.io.*; 
public class Solution {
  public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<ArrayList<Integer>> current = new ArrayList<>();
    for (int i = 0; i < maze.length; i++) {
        current.add(new ArrayList<>());
        for (int j = 0; j < n; j++) {
            current.get(i).add(0);
        }
    }
    current.get(0).set(0, 1);
    int visited[][] = new int[n][n];
    findallpaths(maze, 0, 0, ans, current, visited);
    return ans;
}

public static void findallpaths(int a[][], int row, int col, ArrayList<ArrayList<Integer>> ans,
                                ArrayList<ArrayList<Integer>> current, int visited[][]) {
    if (row == a.length - 1 && col == a[0].length - 1) {
       ArrayList<Integer> path = new ArrayList<>();
       ans.add(path);
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
           ans.get(ans.size()-1).add(visited[i][j]);
        }
    }
   
        return;
    }
    if (row < 0 || col < 0 || row >= a.length || col >= a[0].length || a[row][col] == 0 || visited[row][col]==1) {
        return;
    }
    visited[row][col] = 1;
    current.get(row).set(col, 1);
    findallpaths(a, row - 1, col, ans, current, visited);
    findallpaths(a, row + 1, col, ans, current, visited);
    findallpaths(a, row, col - 1, ans, current, visited);
    findallpaths(a, row, col + 1, ans, current, visited);
    visited[row][col] = 0;
}


}