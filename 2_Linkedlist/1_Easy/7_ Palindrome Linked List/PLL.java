//https://leetcode.com/problems/palindrome-linked-list/description/

public class PLL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = reverseList(slow);

        while (prev != null) {

            if (head.val != prev.val) {
                return false;
            }

            head = head.next;
            prev = prev.next;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
