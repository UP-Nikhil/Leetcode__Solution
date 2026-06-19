
public class DIA {
    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (char s : address.toCharArray()) {
            if (s == '.') {
                result.append("[.]");
            } else {
                result.append(s);
            }
        }
        return result.toString();

    }
    public static void main(String args[]){
        String s= "1.1.1.1";
        System.out.println(" '"+defangIPaddr(s)+"'");
    }
}
