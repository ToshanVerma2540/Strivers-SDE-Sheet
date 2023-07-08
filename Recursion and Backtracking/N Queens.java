import java.util.ArrayList;

public class Solution {

    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        ArrayList<ArrayList<Integer>> board = new ArrayList<>();
        initializeBoard(board, n);
        ArrayList<ArrayList<Integer>> solutions = new ArrayList<>();
        solveNQueensHelper(n, 0, board, solutions);
        return solutions;
    }

    private static void initializeBoard(ArrayList<ArrayList<Integer>> board, int n) {
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0); // Initialize the board with zeros
            }
            board.add(row);
        }
    }

    private static void solveNQueensHelper(int n, int row, ArrayList<ArrayList<Integer>> board,
            ArrayList<ArrayList<Integer>> solutions) {
      
        if (row == n) {
             solutions.add(new ArrayList<>());
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                solutions.get(solutions.size()-1).add(board.get(i).get(j));
                }
            }
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValidPlacement(row, col, board)) {
                board.get(row).set(col, 1); // Place queen at (row, col)
                solveNQueensHelper(n, row + 1, board, solutions);
                board.get(row).set(col, 0); // Backtrack
            }
        }
    }

    private static boolean isValidPlacement(int row, int col, ArrayList<ArrayList<Integer>> board) {
        int n = board.size();

        // Check if there is a queen in the same column
       for(int i =0;i<row;i++) {
    		  if( board.get(i).get(col)==1) {
    			  return false;
    		  }
    	  }

          int x =row;
    	  int y = col;
    	  while(x>=0&&y>=0) {
    		  if(board.get(x).get(y)==1) {
    			  return false;
    		  }
    		  x--;
    		  y--;
    	  }
    	  x=row;y=col;
    	  while(x>=0&&y<n) {
    		  if(board.get(x).get(y)==1) {
    			  return false;
    		  }
    		  x--;y++;
    	  }
        return true;
    }
}

