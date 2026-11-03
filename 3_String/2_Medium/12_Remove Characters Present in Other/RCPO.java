//https://www.geeksforgeeks.org/problems/remove-character3815/1

import java.util.*;
public class RCPO {
  
	/*
	private String revch(String s, String ans, char ch) {
		if (s.isEmpty()) {
			return ans;
		}
		char r = s.charAt(0);
		if (r == ch) { // skip character
			return revch(s.substring(1), ans, ch);
		}
		return revch(s.substring(1), r + ans, ch);
	}
	
	public String removeChars(String s1, String s2) {
		String ans = s1;
		
		// Loop s2 ke characters par chalega
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			
			String rev = revch(ans, "", ch);
			
			ans = revch(rev, "", '\0');
		}
		
		return ans;
	}
	
	*/
	
	public String removeChars(String s1, String s2) {
		
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < s2.length(); i++) {
			set.add(s2.charAt(i));
		}
		
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (!set.contains(ch)) {
				ans.append(ch);
			}
		}
		
		return ans.toString();
	}


}
