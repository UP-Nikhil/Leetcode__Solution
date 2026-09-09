
// https://leetcode.com/problems/sort-colors/description/


class SC {
    public void sortColors(int[] arr) {

        /*
         * // Brutte force;
         * 
         * for (int i = 0; i < arr.length; i++) {
         * boolean swap = false;
         * for (int j = 1; j < arr.length - i; j++) {
         * 
         * if (arr[j] < arr[j - 1]) {
         * 
         * int temp = arr[j];
         * arr[j] = arr[j - 1];
         * arr[j - 1] = temp;
         * 
         * swap = true;
         * }
         * 
         * }
         * if (!swap) {
         * break;
         * }
         * }
         * }
         */

        // T = 0(n);
        // S = 0(1);

        /*
         * int red = 0;
         * int white = 0;
         * int blue = 0;
         * 
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i] == 0)
         * red++;
         * else if (arr[i] == 1)
         * white++;
         * else
         * blue++;
         * }
         * 
         * int i = 0;
         * 
         * while (i < red) {
         * arr[i] = 0;
         * i++;
         * }
         * 
         * while (i < red + white) {
         * arr[i] = 1;
         * i++;
         * }
         * 
         * while (i < red + white + blue) {
         * arr[i] = 2;
         * i++;
         * }
         * 
         */

        int i = 0;
        int k = 0;
        int j = arr.length - 1;

        while (k <= j) {

            if (arr[k] == 1) {
                k++;
            }

            else if (arr[k] == 2) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j--;
            }

            else { // arr[k] == 0
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
                k++;
            }
        }
    }

    public static void main(String[] args) {

    }
}