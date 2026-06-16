
import java.util.*;
public class Chracter {
      public static String processStr(String s) {

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (Character.isLetter(ch)) {
                result.append(ch);
            }

            else if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            }

            else if (ch == '#') {
                result.append(result.toString());
            }

            else if (ch == '%') {
                result.reverse();
            }
        }

        return result.toString();// ye string builder ko normal string me convert kar raha hai;
    }
    public static void main(String[] args) {
        StringBuffer sc= new StringBuffer();
        sc.append("a#b%*");
        String a= sc.toString();
        String b=processStr(a);

        System.out.println(b);
    }
}
