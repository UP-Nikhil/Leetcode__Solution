// https://leetcode.com/problems/divide-two-integers/description/
class DTI {
     public  static int divide(int dividend, int divisor) {

        long ans = (long) dividend / divisor;

        if (ans > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (ans < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) ans;
    }
    public static void main( String args[]){
        int a =98;
        int b= 5;
        System.out.println(divide( a,b));
    }
}