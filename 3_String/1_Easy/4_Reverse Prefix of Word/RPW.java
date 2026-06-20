

public class RPW {
     public static  String reversePrefix(String word, char ch) {
        int f=0;
        int l=0;
        char arr[]= word.toCharArray();
        for(int i=0; i< arr.length; i++){
            if(arr[i]==ch){
                l=i;
                break;
            }
        }
        while(f < l){
            char temp= arr[f];
            arr[f]=arr[l];
            arr[l]= temp;
            l--;
            f++;
        }
        return new String(arr);
        
    }
    public static void main(String[] args) {
         String word = "abcdefd";
         char d= 'd';
         System.out.println(reversePrefix(word,d));
    }
}
