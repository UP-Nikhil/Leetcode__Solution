//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

public class SNILL {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /*
     * public ListNode swapNodes(ListNode head, int k) {
     * ListNode temp = head;
     * int len = 0;
     * 
     * while (temp != null) {
     * len++;
     * temp = temp.next;
     * }
     * 
     * int arr[] = new int[len];
     * temp = head;
     * int i = 0;
     * 
     * while (temp != null && i < len) {
     * arr[i] = temp.val;
     * temp = temp.next;
     * i++;
     * }
     * 
     * int value = arr[k - 1];
     * arr[k - 1] = arr[len - k];
     * arr[len - k] = value;
     * 
     * ListNode dummy = new ListNode(0);
     * ListNode curr = dummy;
     * 
     * for (int j = 0; j < len; j++) {
     * curr.next = new ListNode(arr[j]);
     * curr = curr.next;
     * }
     * 
     * return dummy.next;
     * }
     */

    /*
     * public ListNode swapNodes(ListNode head, int k) {
     * 
     * int len = 0;
     * ListNode temp = head;
     * 
     * while (temp != null) {
     * len++;
     * temp = temp.next;
     * }
     * 
     * ListNode first = head;
     * 
     * for (int i = 1; i < k; i++) {
     * first = first.next;
     * }
     * 
     * ListNode second = head;
     * 
     * for (int i = 1; i <= len - k; i++) {
     * second = second.next;
     * }
     * 
     * int value = first.val;
     * first.val = second.val;
     * second.val = value;
     * 
     * return head;
     * 
     * }
     */
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        ListNode temp = first;

        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        int value = first.val;
        first.val = second.val;
        second.val = value;

        return head;
    }

    public static void main(String args[]) {

    }
}
