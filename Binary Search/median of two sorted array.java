public class Solution {
    public static double median(int[] a, int[] b) {
          // Ensure array 'a' is the smaller one
        if (a.length > b.length) {
            int[] temp = a;
            a = b;
            b = temp;
        }

        int m = a.length;
        int n = b.length;
        int low = 0;
        int high = m;
        int totalLength = (m + n + 1) / 2;

        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = totalLength - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : a[partitionA - 1];
            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : a[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : b[partitionB - 1];
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : b[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // Correct partition found
                if ((m + n) % 2 == 0) {
                    // Even number of elements
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                } else {
                    // Odd number of elements
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                // Too far to the left in array 'a', move partition to the left
                high = partitionA - 1;
            } else {
                // Too far to the right in array 'a', move partition to the right
                low = partitionA + 1;
            }
        }
     return -1;
    }
}