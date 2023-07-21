public class Solution {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
          if (m > n) {
            // Ensure row1 is the smaller array
            int[] tempArr = row1;
            row1 = row2;
            row2 = tempArr;
            int temp = m;
            m = n;
            n = temp;
        }

        int left = Math.max(0, k - n);
        int right = Math.min(m, k);

        while (left <= right) {
            int partition1 = left + (right - left) / 2;
            int partition2 = k - partition1;

            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : row1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : row1[partition1];
            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : row2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : row2[partition2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Correct partition found
                return Math.max(maxLeft1, maxLeft2);
            } else if (maxLeft1 > minRight2) {
                // Move partition1 to the left
                right = partition1 - 1;
            } else {
                // Move partition1 to the right
                left = partition1 + 1;
            }
        }
         return -1;
    }
}
