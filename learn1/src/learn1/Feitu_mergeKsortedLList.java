package learn1;

import java.util.ArrayList;
import java.util.Scanner;

public class Feitu_mergeKsortedLList {
	public ListNode solution(ListNode[] lists) {
		
		int l=lists.length;
		ListNode point,head= new ListNode(0);
		ListNode res=head;
	    point=lists[0];
	    int j=0;
			while(point!=null) {
				
				for(int i=0;i<l;i++) {
				
				if(lists[i]==null) {continue;}
				if(point.val<=lists[i].val) {
					head.next=point;
					
				}else {
					
					point=lists[i];
					j=i;
					head.next=point;
					
				 }
				}
				if(lists[j]!=null)lists[j]=lists[j].next;
				if(lists[j]==null&&j<l-1) {
					point=lists[j+1];
					j=j+1;
				}else {
				point=point.next;
				}
				
				head=head.next;
				
				
			
			
			
		}
		return res.next;
	}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in =new Scanner(System.in);
			ListNode[] lists = new ListNode[3];
			for(int i=0;i<3;i++) {
				System.out.println("di:"+i);
				
			  lists[i]=new ListNode(0);
			  ListNode p;ListNode list=lists[i];
			  
				for(int j=0;j<3;j++) {
					System.out.println("number of lists:");
					
					int a =in.nextInt();
					list.next= new ListNode(a);
				
					
					
					list=list.next;
					
				}
				lists[i]=lists[i].next;
			}
			Feitu_mergeKsortedLList res = new Feitu_mergeKsortedLList() ;
			ListNode jieguo=res.solution(lists);
			
			 while(jieguo!=null) {
				System.out.print(jieguo.val);
				jieguo=jieguo.next;
			 }
			

		
		
		
	}

}
