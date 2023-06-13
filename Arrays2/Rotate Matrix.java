import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int row = 0, col = 0; 
    int prev, curr; 
    int lastRow= n;
    int lastCol= m;
    while (row < lastRow && col < lastCol) 

    {  
        if (row + 1 == lastRow || col + 1 == lastCol)  break;   

        prev = mat.get(row + 1).get(col); 
        for (int i = col; i < lastCol; i++) 
        { 
            curr = mat.get(row).get(i); 
            mat.get(row).set(i,prev); 
            prev = curr; 
        } 
        row++; 
        for (int i = row; i < lastRow; i++) 
        { 
            curr = mat.get(i).get(lastCol-1); 
            mat.get(i).set(lastCol-1,prev); 
            prev = curr; 
        } 
        lastCol--;   
        if (row < lastRow) 
        { 
            for (int i = lastCol-1; i >= col; i--) 
            { 
                curr = mat.get(lastRow-1).get(i); 
                mat.get(lastRow-1).set(i,prev); 
                prev = curr; 
            } 
        } 
        lastRow--; 
        if (col < lastCol) 
        { 
            for (int i = lastRow-1; i >= row; i--) 
            { 
                curr = mat.get(i).get(col); 
                mat.get(i).set(col,prev); 
                prev = curr; 
            } 
        } 
        col++; 
    } 
    }
}
