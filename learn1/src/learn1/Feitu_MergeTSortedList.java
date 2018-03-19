package learn1;

public class Feitu_MergeTSortedList {
	public ListNode solution(ListNode l1,ListNode l2) {
		ListNode res=new ListNode(0);
		ListNode head=res;
		while(l1.next!=null&&l2.next!=null) {
			
			if(l1.val>l2.val) {
				res.next=l2;
				l2=l2.next;
			}else {
				res.next=l1;
				l1=l1.next;
						
			}
			res=res.next;
			
		}
		if(l1!=null){
	        res.next = l1;
	    }
	 
	    if(l2!=null){
	        res.next = l2;
	    }
		
		return head.next;
	}
	

}
