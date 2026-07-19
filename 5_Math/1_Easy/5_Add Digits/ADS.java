// https://leetcode.com/problems/add-digits/description/?envType=problem-list-v2&envId=math

public class ADS{
     private static int to_sum( int n){
        int sum =0;
        while(n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n/ 10;
        }
        return sum;
    }
    public static int addDigits(int num) {
        while(String.valueOf(num).length() != 1 ){
            num = to_sum(num);
        }
        return num;
        
    }
    
    public static void main(String args[]){

    }
}