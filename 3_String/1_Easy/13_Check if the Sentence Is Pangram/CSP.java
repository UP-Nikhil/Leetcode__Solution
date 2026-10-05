//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class CSP {
    
    public boolean checkIfPangram(String sentence) {
        boolean check[] = new boolean[26];
        int len = sentence.length();
        
        for(int i =0; i< len; i++){
            char ch = sentence.charAt(i);
             check[ch -'a'] = true;  
        }

        for(int i = 0; i < 26; i++){
            if(check[i]== false){
                return false;
            }    
        }
        return true;

    }
    public static void main(String[] args) {
        
    }
}

