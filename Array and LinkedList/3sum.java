import java.util.* ;
import java.io.*; 
import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Set<Triplet> set = new HashSet<>();
        
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                
                if (sum == K) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[l]);
                    list.add(arr[r]);
                    Triplet triplet = new Triplet(arr[i], arr[l], arr[r]);                
                    if (!set.contains(triplet)) {
                        al.add(list);
                        set.add(triplet);
                    }
                    
                    l++;
                    r--;
                } else if (sum < K) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        
        return al;
    }
    
    static class Triplet {
        int a;
        int b;
        int c;
        
        public Triplet(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Triplet other = (Triplet) obj;
            return a == other.a && b == other.b && c == other.c;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(a, b, c);
        }
    }
}

