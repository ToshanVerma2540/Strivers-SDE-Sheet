import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		for(int i =0;i<k;i++){
			pq.add(arr.get(i));
		}
		
		for(int i =k;i<n;i++){
			if(pq.peek()<arr.get(i)){
				pq.poll();
				pq.add(arr.get(i));
			}
		}
		for(int i =0;i<k;i++){
			pq2.add(arr.get(i));
		}
			for(int i =k;i<n;i++){
			if(pq2.peek()>arr.get(i)){
				pq2.poll();
				pq2.add(arr.get(i));
			}
		}
    ArrayList<Integer> al = new ArrayList<>();
        al.add(pq2.peek());al.add(pq.peek());
	return al;
	}
}
