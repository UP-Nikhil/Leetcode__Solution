// https://leetcode.com/problems/sqrtx/description/

public class Squar {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int l =0;
        int r= x;
        int answer = 0;
        while(l<= r ){
            int mid = l+ (r-l)/2;
            long square= (long)mid*mid;
            if (square==x){
                return mid;
            }
            else if (square < x){
                answer=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return answer;
        
    }
}
