// https://leetcode.com/problems/boats-to-save-people/description/
import java.util.*;
public class BSP {
    public  static int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {

            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }

        return boats;
    }
    public static void main(String[] args) {
        int arr[]={3,5,3,4};
        int limit = 3;
        System.out.println(numRescueBoats(arr, limit));
    }
}
