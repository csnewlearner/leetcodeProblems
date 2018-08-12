package learn1;

import java.util.Scanner;

public class Feitu_leetcodeshit {
	public void sortColors(int[] nums) {
	       
        int left=0;int right=nums.length-1;
       if(nums.length>1)
       {for(int i=0;i<nums.length; i++){
    	   if(right==i-1){
               break;
           }
             if(nums[i]==2&&right>0){
                  if(nums[right]!=2){
                	  int temp1;
                	  temp1=nums[i];
                	  nums[i]=nums[right];
                	  nums[right]=temp1;
                 
                                    }
                 else{
                     right=right-1;
                 
                     int temp2;
               	  temp2=nums[i];
               	  nums[i]=nums[right];
               	  nums[right]=temp2;
                          
                   
               }
                 right--;
           }
           
              if(nums[i]==0&&i>left){
                  
                  if(nums[left]!=0){
                	  int temp3;
                	  temp3=nums[i];
                	  nums[i]=nums[left];
                	  nums[left]=temp3;
         
                                    }
                 else{
                     left=left+1;
                     if(i>left){
                    	 int temp4;
                   	  temp4=nums[i];
                   	  nums[i]=nums[left];
                   	  nums[left]=temp4;
                           }
                      }
                  left++;
                }
             
              }
                          
            
          }
   }
  

	public static void main(String[] args) {
		Feitu_leetcodeshit shit=new Feitu_leetcodeshit();
		Scanner scan = new Scanner(System.in);
		int s=scan.nextInt();
		int[] input=new int[s];
		for(int i=0;i<s;i++) {
			int single=scan.nextInt();
			input[i]=single;
			
		}
		shit.sortColors(input);
		for(int j=0;j<s;j++) {
         System.out.println(input[j]);
        }
		// TODO Auto-generated method stub

	    }

}
