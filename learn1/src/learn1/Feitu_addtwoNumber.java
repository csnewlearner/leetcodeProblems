package learn1;

public class Feitu_addtwoNumber {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	ListNode l3 =new ListNode();
	    	while(l1.next!=null&&l2.next!=null)
	    	{
	    		l3.val=l1.val+l2.val;
	    	    l3.next.val=l1.next.val+l2.next.val;
	    	}
	    	return l3;
	        
	    }
	}



