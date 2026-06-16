public class Lower {
    public static String toLowerCase(String s) {
        StringBuilder sc = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            sc.append(ch);

        }
        return sc.toString();
    }

    public static void main(String[] args) {
        String s = "HELLO";
        String S = toLowerCase(s);
        for (char ch : S.toCharArray()) {
            System.out.print(ch);
        }
    }
}