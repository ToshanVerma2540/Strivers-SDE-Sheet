import java.util.*;

public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        List<Integer> maximumMeetings = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
       

        for (int i = 0; i < start.length; i++) {
            indices.add(i);
        }

        indices.sort((a, b) -> Integer.compare(end[a], end[b]));

        int lastEndTime = -1;

        for (Integer index : indices) {
            int currentStartTime = start[index];
            int currentEndTime = end[index];

            if (currentStartTime > lastEndTime) {
                maximumMeetings.add((index+1));
                lastEndTime = currentEndTime;
            }
        }

        return maximumMeetings;
    }
}
