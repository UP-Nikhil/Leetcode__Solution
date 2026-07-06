//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

 public class CNS {
     public static int numberOfSteps(int num) {
    int steps = 0;

    while (num > 0) {
        if (num % 2 == 0) {
            num /= 2;     
        } else {
            num -= 1;     
        }
        steps++;          
    }

    return steps;
}
   // use recurtion in this code for coount the steps 
  /*  private int count(int n, int c){
        if(n==0){
            return c;
        }
        if(n % 2==0){
            return count(n/2,c+1);
        }
       return count(n-1, c+1);

    }

    public int numberOfSteps(int num) {
        return count(num,0);
    }
   */


   public static void main(String[] args) {
    int n= 9876;
    System.out.println(numberOfSteps(n));
   }
}