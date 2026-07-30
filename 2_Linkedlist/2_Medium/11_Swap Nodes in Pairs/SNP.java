//https://leetcode.com/problems/swap-nodes-in-pairs/description/?envType=problem-list-v2&envId=linked-list

public class SNP {



 public class ListNode {
    int val;
    ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


//     public ListNode swapPairs(ListNode head) {
        
//        if(head == null || head.next == null){
//         return head;
//        }

//        ListNode  pre= null;
//        ListNode first = head;
//        ListNode second = head.next;
       
//        while(first != null && second != null ){
//           ListNode third = second.next;
//           second.next = first;
//           first.next = third;
//           if(pre!=null){
//             pre.next =second;
//           }
//           else{
//             head = second;
//           }
//           pre = first;
//           first = third;
//           if( third != null ){
//              second =third.next;
//           }
//           else{
//             second = null;
//           }
//        }
        
//         return head;
//     }


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            prev = first;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}
