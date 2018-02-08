package learn1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Feitu_Letter_combaination {
	private String[] Letter =new String[]{" ","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	//private List<String> dfs(List<String> res,String digits,)
	//@SuppressWarnings("null")
	public  List<String> LetterCombanitions(String digits)
	{   int zs=Integer.parseInt(digits);
		int res = zs,i,j;
		String comb;
		List<String> letterlis=new ArrayList<String>();
		if(res>10)
		{for(i=0;i<Letter[res/10].length();i++)
		{
			for(j=0;j<Letter[res%10].length();j++)
			{
				comb=String.valueOf(Letter[res/10].charAt(i))+String.valueOf(Letter[res%10].charAt(j));
				letterlis.add(comb);
			}
			
		}
		}
		return letterlis;
		
	}
	
	
		
	
public static void main(String[] args) {

	Feitu_Letter_combaination s=new Feitu_Letter_combaination();
	System.out.println(s.LetterCombanitions("34"));

	// TODO Auto-generated method stub
	//System.out.println('a');;

}
}

