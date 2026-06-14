class Solution {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }
    // fuction hai 

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int a = 0, b = 0, c = 0;
        while (tempA != null) {
            a++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            b++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (a > b) {
            c = a - b;
            for (int i = 0; i < c; i++) {
                tempA = tempA.next;
            }
        } else {
            c = b - a;
            for (int i = 0; i < c; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempB;
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(5);
        ListNode b = new ListNode(6);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(8);
        ListNode e = new ListNode(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
