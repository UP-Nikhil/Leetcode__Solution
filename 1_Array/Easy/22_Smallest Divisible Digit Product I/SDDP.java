//https://leetcode.com/problems/smallest-divisible-digit-product-i/description/

class SDDP {
    public int smallestNumber(int n, int t) {

        while (true) {
            int temp = n;
            int prod = 1;
            
            while (temp > 0) {
                prod *= (temp % 10);
                temp = temp / 10;
            }
            
            if (prod % t == 0) {
                return n;
            }
            n++;
        }
    }
    public static void main(String[] args) {
        
    }
}