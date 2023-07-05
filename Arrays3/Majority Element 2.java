import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
       // map.put(map.get(0), 1);
        for(int i =0;i<arr.size();i++){
            if(!map.containsKey(arr.get(i))){
                map.put(arr.get(i), 1);
            }else{
                int ex = map.get(arr.get(i))+1;
                map.put(arr.get(i), ex);
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int ele = entry.getValue();
            int key = entry.getKey();
            if(ele>(arr.size()/3)){
              al.add(key);
            }
        }
        return al;
    }
}