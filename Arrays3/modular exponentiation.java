import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
      
    long res = 1;
    x = x % m;

    while (n > 0) {
        if (n % 2 == 1) {
            res = (res * x) % m;
        }
        x = (x * x) % m;
        n = n / 2;
    }

    return (int) (res + m) % m;
    }
}