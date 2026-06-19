// https://leetcode.com/problems/find-the-highest-altitude/description/
public class FHA {
    public static int largestAltitude(int[] gain) {
        int maxPoint = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current = current + gain[i];
            maxPoint = Math.max(maxPoint, current);
        }
        return maxPoint;
    }
    public static void main(String[] args) {
        int arr[]={-4,-3,-2,-1,4,3,2};
        int ans = largestAltitude(arr);
        System.out.println("Hiegest Altitude : "+ ans);

    }
}
