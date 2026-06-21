import java.util.*;

public class MIC {
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < costs.length; i++) {

            if (sum + costs[i] > coins) {
                break;
            }

            sum += costs[i];
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        int costs[] = { 1, 3, 2, 4, 1 };
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }
}
