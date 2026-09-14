//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/

public class MTSL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    /*
     * public int pairSum(ListNode head) {
     * 
     * ArrayList<Integer> num = new ArrayList<>();
     * 
     * ListNode temp = head;
     * 
     * while (temp != null) {
     * num.add(temp.val);
     * temp = temp.next;
     * }
     * 
     * int i = 0;
     * int j = num.size() - 1;
     * 
     * int max = 0;
     * 
     * while (i < j) {
     * 
     * int sum = num.get(i) + num.get(j);
     * 
     * max = Math.max(max, sum);
     * 
     * i++;
     * j--;
     * }
     * 
     * return max;
     * }
     * 
     */
    private ListNode reverse(ListNode head) {
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

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode a = reverse(slow);
        ListNode b = head;
        int max = Integer.MIN_VALUE;
        while (a != null && b != null) {
            int sum = a.val + b.val;
            max = Math.max(max, sum);
            a = a.next;
            b = b.next;
        }
        return max;
    }

    public static void main(String[] args) {

    }
}