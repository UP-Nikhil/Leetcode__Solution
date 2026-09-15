//https://leetcode.com/problems/repeated-dna-sequences/description/

import java.util.*;

public class RDS {
    public static List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> ans = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String dna = s.substring(i, i + 10);
            if (set.contains(dna)) {
                ans.add(dna);
            } else {
                set.add(dna);
            }
        }

        return new ArrayList<>(ans);
    }

    public static void main (String args[]){
        
    }
}