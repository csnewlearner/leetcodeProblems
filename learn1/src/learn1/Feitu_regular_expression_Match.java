package learn1;

public class Feitu_regular_expression_Match {
	public boolean solution(String s,String p) {
		if(p.isEmpty())return s.isEmpty();
		
	    
		boolean firstmatch=(!s.isEmpty()&&s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
		if(p.length()>=2&&p.charAt(1)=='*') {
			
			
			return (solution( s, p.substring(2))||!s.isEmpty()&&firstmatch&&solution(s.substring(1),p));
		}else {
			return firstmatch&&solution(s.substring(1),p.substring(1));
		}
		
			
			
		
		
		
		
	}
	public static void main(String[] args) {
		String str="aa";String str2="a*";
		// TODO Auto-generated method stub
		Feitu_regular_expression_Match s =new Feitu_regular_expression_Match();
		
		System.out.print(s.solution(str, str2));
	}

}
