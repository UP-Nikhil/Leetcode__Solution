//https://leetcode.com/problems/reverse-linked-list-ii/description/?envType=problem-list-v2&envId=dwgvk18c
class RLL2{
    public class ListNode {
     int val;
     ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // prev को left-1 position तक ले जाओ
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        // Reverse
        for (int i = 0; i < right - left; i++) {

            ListNode next = curr.next;

            curr.next = next.next;

            next.next = prev.next;

            prev.next = next;
        }

        return dummy.next;
    }
    public static void main(String args[]){
        
    }
}
