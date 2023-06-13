import java.util.* ;
import java.io.*; 
public class Solution {


    private static long mergeSort(long[] arr, long[] temp, int left, int right) {
          if (left == right) {
               long invCount = 0;
               return invCount;
          }
            int mid = (left + right) / 2;

           long leftCount = mergeSort(arr, temp, left, mid);
           long rightCount = mergeSort(arr, temp, mid + 1, right);

            long invCount = merge(arr, temp, left, mid + 1, right,leftCount+rightCount);
        
        return invCount;
    }

    private static long merge(long[] arr, long[] temp, int left, 
    int mid, int right,long invCount) {
        int i = left;
        int j = mid;
        int k = left;
      //  long invCount = 0;

        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += mid - i;
            }
        }

        while (i <= mid - 1)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left; i <= right; i++)
            arr[i] = temp[i];

        return invCount;
    }

      public static long getInversions(long arr[], int n) {
        long[] temp = new long[n];
        return mergeSort(arr, temp, 0, n-1);
    }
}