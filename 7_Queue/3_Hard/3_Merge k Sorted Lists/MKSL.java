//

import java.util.*;

public class MKSL {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }
/* 
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (ListNode head : lists) {
            while (head != null) {

                list.add(head.val);
                head = head.next;
            }
        }

        Collections.sort(list);
        ListNode ans = new ListNode(0);
        ListNode temp = ans;

        for (int val : list) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return ans.next;
    }
*/

    // Using Priority Queue;

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {

            if (node != null)
                pq.add(node);
        }

        ListNode dummy = new ListNode(0);

        ListNode temp = dummy;

        while (!pq.isEmpty()) {

            ListNode node = pq.poll();

            temp.next = node;

            temp = temp.next;
            if (node.next != null)
                pq.add(node.next);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}
