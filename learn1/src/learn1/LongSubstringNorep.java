package learn1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongSubstringNorep{

	public int LongSub(String s){
	int n=s.length();
	Set<Character> set=new HashSet();
	int i=0;
	int j=0;
	int ans=0;
	while(i<n&&j<n)
	{
		
		if(!set.contains(s.charAt(j))){
			
			set.add(s.charAt(j));
			j++;
			ans=Math.max(ans, j-i);
			
		}
		else{
			
			set.remove(s.charAt(i));
			i++;
		}
		
		
		
		

	}
	
	
		
	//Iterator<Character> iter=set.iterator();
	//System.out.print(iter.next());
	
	for(Character ch:set){System.out.print(ch);
		
		
	}
	return ans;
	}
	public static void main(String[] args) {
		String str="abcabde";
		// TODO Auto-generated method stub
		LongSubstringNorep s =new LongSubstringNorep();
		
		System.out.println(s.LongSub(str));
	}


}
