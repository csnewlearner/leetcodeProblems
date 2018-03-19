package learn1;


import java.util.*;


public class Feitu_4sum {
    public List<List<Integer>> solution(int[] s,int t){
    	int i=0,j=1,m=s.length-2,n=s.length-1;
    	
    	List<List<Integer>> res=new ArrayList();
    	Arrays.sort(s);
    	int temp;
    	while(i<j&&j<=s.length/2&&s.length/2<m&&m<n) {
    		temp=s[i]+s[j]+s[m]+s[n];
    		List<Integer> arry=new ArrayList(Arrays.asList(s[i],s[j],s[m],s[n]));
    		if(temp>t) {
    			m--;
    			if(m-1<=s.length/2) {
    				n--;
    				if(temp==t) {res.add(arry);}
    			}
    			if(temp==t) {res.add(arry);}
    		}else {
    			j++;
    			if(j>=s.length/2) {
    				
    				i++;
    				if(temp==t) {res.add(arry);}
    				
    			}
    			if(temp==t) {res.add(arry);}
    		}
    		
    		
    	}
    	
    	
    	
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
