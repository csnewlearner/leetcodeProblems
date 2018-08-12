package learn1;

import java.util.Scanner;

public class Feitu_evencharandoddchar {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan=new Scanner(System.in);
	            
	        int input =scan.nextInt();
	        String[] s=new String[input];
	        for (int i=0;i<s.length;i++){
	            s[i]=scan.nextLine();
	        }
	        if(input<=0)return ;
	        for(int m=0;m<input;m++){
	            for(int n=0;n<s[m].length();n=n+2){
	               System.out.print(s[m].charAt(n));
	            }
	            System.out.print(" ");
	            for(int k=1;k<s[m].length();k=k+2){
	                System.out.print(s[m].charAt(k));
	            }
	            System.out.println();
	        }
	    }

}
