package learn1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Feitu_AlluniformSubString {

    // Complete the weightedUniformStrings function below.
   public static void  weightedUniformStrings(String s, int[] queries) {
        //String[] res=new String[queries.length];
    
        Set<Integer> map=new HashSet<Integer>();
  
       int j=0; 
        
        while(j<s.length()){
            
            map.add(s.charAt(j)-'a'+1);
            int k=j;
            if(j<s.length()-1&&s.charAt(j)==s.charAt(j+1)){
                int sum=s.charAt(j)-'a'+1;
                while(s.charAt(k)==s.charAt(k+1)){
            
                sum+=s.charAt(k)-'a'+1;
                   map.add(sum);
                
                  
                    k++;
                }
               
            }
            j=k;
            j++;
        }
         for(int q=0;q<queries.length;q++){
            if(!map.contains(queries[q])){
                System.out.println("No");
            }else{
            	 System.out.println("Yes");
            }
        }
        
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        weightedUniformStrings(s, queries);

       

        scanner.close();
    }
}
