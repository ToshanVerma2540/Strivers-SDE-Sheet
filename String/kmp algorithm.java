import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean findPattern(String p, String s) {
    int m = p.length(); // length of the pattern
    int n = s.length(); // length of the string

    // Step 1: Construct the prefix table (also known as failure function)
    int[] prefixTable = buildPrefixTable(p);

    int i = 0; // index for the string
    int j = 0; // index for the pattern

    while (i < n) {
        if (p.charAt(j) == s.charAt(i)) {
            j++;
            i++;

            if (j == m) {
                // Pattern found
                return true;
            }
        } else {
            if (j != 0) {
                j = prefixTable[j - 1];
            } else {
                i++;
            }
        }
    }

    // Pattern not found
    return false;
}

// Helper method to construct the prefix table
private static int[] buildPrefixTable(String p) {
    int m = p.length();
    int[] prefixTable = new int[m];
    int i = 0;
    int j = 1;

    while (j < m) {
        if (p.charAt(i) == p.charAt(j)) {
            prefixTable[j] = i + 1;
            i++;
            j++;
        } else {
            if (i != 0) {
                i = prefixTable[i - 1];
            } else {
                prefixTable[j] = 0;
                j++;
            }
        }
    }

    return prefixTable;
}

}