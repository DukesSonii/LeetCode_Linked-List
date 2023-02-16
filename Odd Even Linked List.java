class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode pOdd = new ListNode(0);
        ListNode pEven = new ListNode(0);
        ListNode p = head;
        ListNode p1 = pOdd;
        ListNode p2 = pEven;
        
        if (head == null || head.next == null) {
            return head;
        }

        while (p != null) 
        {
            pOdd.next = p;
            pOdd = pOdd.next;
            if (p.next != null) {
                pEven.next = p.next;
                pEven = pEven.next;
                p = p.next.next;
            } else {
                pEven.next = null;
                break;
            }
        }
        pOdd.next = p2.next;
        return p1.next;
    }
}
