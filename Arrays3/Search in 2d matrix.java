import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
       int k =0;int i =0;
       int j= mat.get(k).size()-1;
       boolean isentered = false;
       while(k<mat.size()){
           if(mat.get(k).get(j)==target||mat.get(k).get(i)==target){
               return true;
           }
          if(mat.get(k).get(j)>target&&mat.get(k).get(i)<target){
               i =0; j= mat.get(k).size()-1;
                int mid = (i+j)/2;
                isentered = true;
              while(i<j){
             mid = ((i+j)/2);
              mid = mat.get(k).get(mid);
              if(mid==target){
                  return true;
              }else if(mid>target){
                  j = mid-1;
              }else{
                  i = mid+1;
              }

              }
          }
          if(isentered == true){
              return false;
          }
          k++;
       }

       return false;
    }
}
