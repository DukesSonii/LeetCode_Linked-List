class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null) 
        {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            // carry logic for eg. 4+6=10 so one will be the carry b/c 10/10 = 1 and 10%10 = 0
            int curr_sum = l1_val + l2_val + carry;
            carry = curr_sum / 10;
            int lastdigit = curr_sum % 10;
            
            ListNode new_node = new ListNode(lastdigit);
            curr.next = new_node;
            
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (carry > 0)  //eg 900 + 900 = 1800 so create new place value 
        {
            curr.next = new ListNode(carry);
        }
        //we can return reference to head of our new list
        return dummyHead.next;
    }
}
