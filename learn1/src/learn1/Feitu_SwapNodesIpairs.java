package learn1;

public class Feitu_SwapNodesIpairs {
public ListNode solution(ListNode head) {
	ListNode list=new ListNode(0);
	ListNode rlist=new ListNode(0);
	ListNode duprlist,duplist,res=new ListNode(0);
	duprlist=rlist;
	duplist=list;
	rlist=head;
	list=head.next;
	res=duprlist;
	int i=0;
	while(head!=null) {
		
		head=head.next;
		i++;
	}
	int m = 0, n = 0,j=1;
	if(i%2==0) {
		while(m<i&&n<=i&&j<=i/2) {
		n=2*j;
		rlist.next=rlist.next.next;
		rlist=rlist.next.next;
		m=2*j-1;
		list.next=list.next.next;
		list=list.next.next;
		j++;
		}
	}else {
		while(m<=i&&n<=i+1&&j<=(i+1)/2) {
			n=2*j;
			rlist.next=rlist.next.next;
			rlist=rlist.next.next;
			m=2*j-1;
			j++;
		}
	}
	int sum=0;
	while(sum<=i) {
		duprlist.next=duplist;
		duprlist=duprlist.next;
		duplist=duplist.next;
		
	}
	
	
	
	return res;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
