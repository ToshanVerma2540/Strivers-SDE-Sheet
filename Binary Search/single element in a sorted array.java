import java.util.ArrayList;
public class Solution
{
   public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int left = 1;
    int right = arr.size() - 1;
        if (arr.size() == 1){
            return arr.get(0);
        }
     if(arr.get(right) != arr.get(right-1)){
       return arr.get(right);
     }else if(arr.get(0) != arr.get(1)){
         return arr.get(0);
     }
    while (left <= right) {
        int mid =  left+(right-left) / 2;

        if (arr.get(mid) !=arr.get(mid-1)&&arr.get(mid)!=arr.get(mid+1)) {
            return arr.get(mid);
        }else if(mid%2 == 0&&arr.get(mid) == arr.get(mid+1)||
        mid%2 == 1&&arr.get(mid)==arr.get(mid-1)){
            left = mid+1;
        }else{
          right = mid -1;
        }
    }

    return -1; 
    }
}

