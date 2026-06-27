// https://leetcode.com/problems/reverse-string/description/

public class RS {
     public void reverseString(char[] s) {
        int l=0;
        int r= s.length-1;
        while(l<r){
            char temp =s[l];
            s[l] =s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        
    }
}
