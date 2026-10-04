//https://leetcode.com/problems/split-linked-list-in-parts/description/


 


public class SLLP {
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode[] splitListToParts(ListNode head, int k) {

        int n = 0;
        ListNode curr = head;

        while (curr != null) {
            n++;
            curr = curr.next;
        }

        int div = n / k;
        int remain = n % k;

        ListNode res[] = new ListNode[k];

        curr = head;
        for (int i = 0; i < k; i++) {

            int count = div;

            if (remain > 0) {
                count = count + 1;
                remain = remain - 1;
            }

            ListNode temp = curr;
            ListNode prev = null;
            int counter = 0;

            while (counter < count) {
                prev = curr;
                curr = curr.next;
                counter++;
            }

            if (prev != null) {
                prev.next = null;
            }
            res[i] = temp;

        }
        return res;

    }

    public static void main(String[] args) {
        
    }
}