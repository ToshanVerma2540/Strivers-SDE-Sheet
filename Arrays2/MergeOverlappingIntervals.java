import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;

//import org.graalvm.compiler.lir.alloc.lsra.Interval;

import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
       List<Interval> list = new ArrayList<>();
         Arrays.sort(intervals, Comparator.comparingInt(obj -> obj.start));
       int start = intervals[0].start;
       int end = intervals[0].finish;
        for(int i =1;i<intervals.length;i++){
            if(intervals[i].start<=end){
                end = Math.max(intervals[i].finish,end);
            }else{
                list.add(new Interval(start,end));
                start = intervals[i].start;
                end = intervals[i].finish;
            }
        }
        list.add(new Interval(start,end));
       return list;
    }
}
