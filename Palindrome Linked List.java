
class Solution {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null; 
        }
        
    }
    public Node findmiddle(Node head){ 
        Node slow = head; 
        Node fast = head;
        while(fast!= null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;       
    }   

    public boolean isPalindrome(Node head) {
            if(head== null || head.next == null ) {  //0 ele or 1ele
                return true;
            }
    
            // Step 1- to find middle
            Node midNode = findmiddle(head);            
            
            
            //Step 2- reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            Node right =  prev; //right halv head
            Node left = head;
           
            
            //step 3- check leaft half and right half
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;   //left ko update kr lia and check for remaining elements
                right = right.next;     //right ko bh update kr lia and check for remaining elements
                
            }
            return true;        //ll is paliindrome
    } 
}

/*

        
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
    
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }       
         
*/
