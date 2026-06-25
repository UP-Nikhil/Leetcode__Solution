// https://leetcode.com/problems/contains-duplicate/description/
import  java.util.*;
public class CD {
  
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int num :nums){
            if(s.contains(num)){
                return true;
            }
            s.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={ 1,1,2,3,4,5,6,7};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
} 

