//https://leetcode.com/problems/daily-temperatures/description/
import java.util.*;
public class DT {
     public int[] dailyTemperatures(int[] tpr) {

        int[] ans = new int[tpr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = tpr.length - 1; i >= 0; i--) {

            while (!st.empty() && tpr[st.peek()] <= tpr[i]) {
                st.pop();
            }

            if (st.empty()) {
                ans[i] = 0;
            } else {
                ans[i] = st.peek() - i;
            }

            st.push(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
