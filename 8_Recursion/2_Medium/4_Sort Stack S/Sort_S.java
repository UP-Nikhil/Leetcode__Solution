//https://www.geeksforgeeks.org/problems/sort-a-stack/1

import java.util.*;
public class Sort_S {
    
	public void sortStack(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		
		int top = st.pop();
		sortStack(st);
		insertAt(st, top);
	}
	
	private static void insertAt(Stack<Integer> st, int elem) {
		if (st.isEmpty() || st.peek() <= elem) {
			st.push(elem);
			return;
		}
		int top = st.pop();
		insertAt(st, elem);
		st.push(top);
	}
	public static void main(String [] args){

    }

}
