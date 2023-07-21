
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public static void findMedian(int arr[]) {
     
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.add(num);
            } else {
                minHeap.add(num);
            }

            // Balance the heaps if necessary
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

            // Calculate the median
            int median;
            if (maxHeap.size() == minHeap.size()) {
                median = (maxHeap.peek() + minHeap.peek()) / 2;
            } else {
                median = maxHeap.peek();
            }
            System.out.print(median+" ");
        }
    }


}
