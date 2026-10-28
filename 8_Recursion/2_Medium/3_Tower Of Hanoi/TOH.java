//https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
public class TOH {

    public int towerOfHanoi(int n, int from, int to, int aux) {

        // return (int)Math.pow(2, n) -1;

        if (n == 0) {
            return 0;
        }

        return 2 * towerOfHanoi(n - 1, from, aux, to) + 1;
    }

    public static void main(String[] args) {

    }

}
