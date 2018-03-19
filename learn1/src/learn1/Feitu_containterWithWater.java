package learn1;

public class Feitu_containterWithWater {
	
	public int solution(int[] s) {
		
		int i=0;int j=s.length-1;
		int res=(j-i)*(s[i]+s[j]);
		int temp;
		while(i<j) {
			temp=(j-i)*(s[i]+s[j]);
			if(s[i+1]<s[i]) {i++;
			
			}else {
				
				if((j-i-1)*(s[i+1]+s[j])>res) {
					res=(j-i-1)*(s[i+1]+s[j]);
				}
				i++;
				
			}
			if(s[j-1]<s[j]) {j--;
			}else {
				
				if((j-i-1)*(s[i]+s[j-1])>res) {
					res=(j-i-1)*(s[i]+s[j-1]);
				}
				j--;
			}
		}
		
		return res;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
