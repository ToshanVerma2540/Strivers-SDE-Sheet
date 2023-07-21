public class Solution {
    public static int NthRoot(int n, int m) {
     int l = 1;
     int h = m;
     while(l<=h){
         int mid = (l+h)/2;
         int midN = mul(mid,n,m);
         if(midN == 1){
             return mid;
         }else if(midN==2){
             h = mid-1;
         }else{
             l = mid+1;
         }
     }
     return -1;
     }
public static int mul(int num,int n,int m) {
		long ans =  num;
		for(int i =1;i<n;i++) {
			ans = ans*num;
            if(ans>m){
                return 2;
            }
		}
	   if(ans == m){
            return 1;
       }else{
           return 0;
       }
	}
	
}
