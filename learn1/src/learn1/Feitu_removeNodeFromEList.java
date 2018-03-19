package learn1;

import java.util.Arrays;
import java.util.HashSet;

public class Feitu_removeNodeFromEList {
    public ListNode solution(ListNode head,int n) {
    	ListNode origin=new ListNode(0);
    	origin.next=head;
    	ListNode begin = null;
    	begin=origin;
    	ListNode second ;
    	second=origin;
    	
    	for(int i=0;i<=n;i++) {
    		second=second.next;
    		
    	}
    	while(second!=null) {
    		
    		second=second.next;
    		begin=begin.next;
    	}
    	 begin.next=begin.next.next;
    	 return origin.next;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=null;
		Feitu_removeNodeFromEList res = new Feitu_removeNodeFromEList() ;
		ListNode haha=res.solution(head, 2);
		while(haha!=null) {
			System.out.print(haha.val);
			haha=haha.next;
		}

	}

}
