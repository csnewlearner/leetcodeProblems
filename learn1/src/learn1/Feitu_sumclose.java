package learn1;
import java.util.*;

public class Feitu_sumclose {
	public List<List<Integer>>  Sum_close(int[] sum,int target)
	{
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		Arrays.sort(sum);
		int num=sum.length;
		int temp;
		int total=sum[0]+sum[1]+sum[2];
		for(int i = 0;i<=num;i++){
			int j=i+1;
			int k=num-1;
			
			while(k>j){
				temp=(sum[i]+sum[j]+sum[k]);
				if(Math.abs(target-temp)<Math.abs(target-total))
				{   total=temp;
					
				}
				else{
					
					j++;
					k--;
				}
				if(temp<target)
				{
					j++;
					
				}
				else if(temp>target)
				{
					k--;
				}
					
			
				
			}	
			ret.add(Arrays.asList(sum[i],sum[j],sum[k]));
			
		}
		return ret;
		
		
	}


public static void main(String[]args)
{
	Feitu_sumclose result=new Feitu_sumclose();
int[] s={1,3,5,6,7,12,16};
int target=14;
System.out.println(result.Sum_close(s, target));



}
}
