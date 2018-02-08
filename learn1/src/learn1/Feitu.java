package learn1;

public class Feitu {
	public int[] twoSum(int[]nums,int target)
	{ int i,j;int[] indices=new int[2];;
		for(i=0;i<=nums.length;i++){
			for(j=nums.length;j>i;j--){
				if(nums[i]+nums[j]==target){
					indices[0]=nums[i];
					indices[1]=nums[j];
					
					
				}
				
			}
		}
		
		return indices;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
