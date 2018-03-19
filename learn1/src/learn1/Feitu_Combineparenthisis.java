package learn1;

import java.util.ArrayList;
import java.util.List;

public class Feitu_Combineparenthisis {
	public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Feitu_Combineparenthisis s=new Feitu_Combineparenthisis();
		List<String> list=s.generateParenthesis(5);
		for(int i=0;i<list.size();i++) {
			
			System.out.print("123"+"/"+list.get(i));
		}
	}

}
